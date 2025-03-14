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
package org.jooq.codegen;

import org.jooq.meta.Definition;

/**
 * A strategy for keeping all names exactly as they are reported by the
 * database.
 *
 * @author Lukas Eder
 */
public class KeepNamesGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public String getJavaIdentifier(Definition definition) {
        return definition.getOutputName();
    }

    @Override
    public String getJavaSetterName(Definition definition, Mode mode) {
        return definition.getOutputName();
    }

    @Override
    public String getJavaGetterName(Definition definition, Mode mode) {
        return definition.getOutputName();
    }

    @Override
    public String getJavaMethodName(Definition definition, Mode mode) {
        return definition.getOutputName();
    }

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        if (mode == Mode.PATH)
            switch (getCase(definition.getOutputName())) {
                case MIXED:
                    return definition.getOutputName() + "Path";
                case LOWER:
                    return definition.getOutputName() + "_path";
                case UPPER:
                default:
                    return definition.getOutputName() + "_PATH";
            }
        else
            return definition.getOutputName();
    }

    @Override
    public String getJavaMemberName(Definition definition, Mode mode) {
        return definition.getOutputName();
    }
}
