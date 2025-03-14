/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.Keywords.K_TABLE;
import static org.jooq.impl.Names.N_FUNCTION;

import org.jooq.Context;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableOptions;
import org.jooq.exception.SQLDialectNotSupportedException;
import org.jooq.impl.QOM.UNotYetImplemented;

/**
 * @author Lukas Eder
 */
final class FunctionTable<R extends Record>
extends
    AbstractTable<R>
implements
    UNotYetImplemented
{

    private final Field<?> function;

    FunctionTable(Field<?> function) {
        super(TableOptions.function(), N_FUNCTION);

        this.function = function;
    }

    // -------------------------------------------------------------------------
    // XXX: Table API
    // -------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    @Override
    public final Class<? extends R> getRecordType() {
        // TODO: [#4695] Calculate the correct Record[B] type
        return (Class<? extends R>) RecordImplN.class;
    }

    @Override
    final FieldsImpl<R> fields0() {
        return new FieldsImpl<>();
    }

    // -------------------------------------------------------------------------
    // XXX: DSL API
    // -------------------------------------------------------------------------

    @Override
    public final Table<R> as(Name as) {
        return new TableAlias<>(new FunctionTable<>(function), as);
    }

    @Override
    public final Table<R> as(Name as, Name... fieldAliases) {
        return new TableAlias<>(new FunctionTable<>(function), as, fieldAliases);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {
            case HSQLDB: {
                ctx.visit(K_TABLE).sql('(').visit(function).sql(')');
                break;
            }



            // [#4254] This is required to enable using PostgreSQL functions
            // with defaulted parameters.


            case POSTGRES:
            case YUGABYTEDB: {
                ctx.visit(function);
                break;
            }

            default:
                throw new SQLDialectNotSupportedException("FUNCTION TABLE is not supported for " + ctx.dialect());
        }
    }
}
