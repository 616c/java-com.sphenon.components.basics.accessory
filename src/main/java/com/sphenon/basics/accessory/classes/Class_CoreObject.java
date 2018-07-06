package com.sphenon.basics.accessory.classes;

/****************************************************************************
  Copyright 2001-2018 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.message.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.metadata.tplinst.*;
import com.sphenon.basics.validation.returncodes.*;

import com.sphenon.basics.accessory.*;
import com.sphenon.basics.accessory.tplinst.*;

public class Class_CoreObject implements CoreObject {

    public Class_CoreObject() {
    }

    public Class_CoreObject(CallContext context) {
    }

    protected OSet_Object_Type_ accessory_o_set;

    public OSet_Object_Type_ getAccessorys(CallContext context) {
        if (this.accessory_o_set == null) {
            accessory_o_set = new OSetImpl_Object_Type_(context);
        }
        return this.accessory_o_set;
    }

    public OSet_Object_Type_ defaultAccessorys(CallContext context) {
        return null;
    }

    public void setAccessorys(CallContext context, OSet_Object_Type_ accessory_o_set) {
        this.accessory_o_set = accessory_o_set;
    }

    public void initialiseClass_CoreObject (CallContext call_context) {
    }

    protected boolean is_destroyed = false;

    public boolean getIsDestroyed(CallContext context) {
        return this.is_destroyed;
    }
    public void destroy (CallContext context) {
        if (!this.is_destroyed) {
            this.is_destroyed = true;
            this.destroyClass_CoreObject(context);
        }
    }

    public ValidationFailure canDestroy (CallContext context) {
        return null;
    }

    protected void destroyClass_CoreObject (CallContext context) {
    }
  
    public void finalize () throws Throwable {
        this.destroy(RootContext.getDestructionContext());
    }

    public void validateinstanceClass_CoreObject(CallContext context) throws ValidationFailure {
    }
    
    protected ValidationFailure validateinstanceClass_CoreObject(CallContext call_context, ValidationFailure vf) {
        return vf;
    }

    public void validate(CallContext call_context) throws ValidationFailure {
    }
}
