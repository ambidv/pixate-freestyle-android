/*******************************************************************************
 * Copyright 2012-present Pixate, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pixate.freestyle.styling.virtualStyleables;

import java.lang.ref.WeakReference;

/**
 * A virtual styleable.
 * 
 * @author Shalom Gibly
 */
public abstract class PXVirtualStyleable {

    private WeakReference<Object> parent;

    public PXVirtualStyleable(Object parent) {
        this.parent = new WeakReference<Object>(parent);
    }

    public Object getParent() {
        return parent.get();
    }
}
