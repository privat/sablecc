/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.structure;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.sablecc.exception.InternalException;
import org.sablecc.sablecc.syntax3.node.ANormalNamedExpression;
import org.sablecc.sablecc.syntax3.node.TIdentifier;

public class NormalExpression
        extends Expression {

    private final ANormalNamedExpression declaration;

    private final Set<NormalExpression> dependencies = new LinkedHashSet<NormalExpression>();

    NormalExpression(
            ANormalNamedExpression declaration) {

        if (declaration == null) {
            throw new InternalException("declaration may not be null");
        }

        this.declaration = declaration;
    }

    @Override
    public TIdentifier getNameDeclaration() {

        return this.declaration.getName();
    }

    public void addDependency(
            NormalExpression expression) {

        if (expression == null) {
            throw new InternalException("expression may not be null");
        }

        this.dependencies.add(expression);
    }

    public Set<NormalExpression> getDependencies() {

        return Collections.unmodifiableSet(this.dependencies);
    }
}