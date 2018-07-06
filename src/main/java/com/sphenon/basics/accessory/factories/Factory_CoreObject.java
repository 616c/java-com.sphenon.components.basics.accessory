package com.sphenon.basics.accessory.factories;

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
import com.sphenon.basics.message.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.metadata.tplinst.*;
import com.sphenon.basics.factory.*;
import com.sphenon.basics.validation.returncodes.*;

import com.sphenon.basics.accessory.*;
import com.sphenon.basics.accessory.tplinst.*;
import com.sphenon.basics.accessory.classes.*;

public class Factory_CoreObject implements Factory {

    private Class_CoreObject internal_instance;

    public Factory_CoreObject (CallContext call_context) {
    }

    public Factory_CoreObject () {
    }

    protected boolean final_validation_required = true;

    public void reset (CallContext context) {
        this.internal_instance = null;
        accessory_o_set = null;
    }

    protected void prepareInstanceAttributesFactory_CoreObject (CallContext context, Class_CoreObject instance) {
        instance.setAccessorys(context, this.getAccessorys(context));
    }

    public void confirmAttributes_Factory_CoreObject(CallContext call_context) {
    }

    public void confirmAttributes(CallContext context) {
        confirmAttributes_Factory_CoreObject(context);
    }

    public void validateFinally_Factory_CoreObject(CallContext call_context) throws ValidationFailure {
    }

    public void validateFinally(CallContext call_context) throws ValidationFailure {
    }
  
    public CoreObject precreateCoreObject (CallContext context) {
        if (this.internal_instance == null) {
            this.internal_instance = new Class_CoreObject(context);
        }
        return this.internal_instance;
    }

    public CoreObject createCoreObject (CallContext context) throws ValidationFailure {
        Class_CoreObject instance = this.internal_instance;
        this.internal_instance = null;
        if (instance == null) {
            instance = new Class_CoreObject(context);
        }

        confirmAttributes(context);

        validateFactory_CoreObject(context); // might throw validation error.
        validateFinally(context);
  
        prepareInstanceAttributesFactory_CoreObject(context, instance);

        return instance;
    }

    public CoreObject mustCreateCoreObject (CallContext context) {
        Class_CoreObject instance = this.internal_instance;
        this.internal_instance = null;
        if (instance == null) {
            instance = new Class_CoreObject(context);
        }

        confirmAttributes(context);

        try {
            validateFactory_CoreObject(context);
            validateFinally(context);
        } catch (ValidationFailure vf) {
            CustomaryContext.create((Context)context).throwPreConditionViolation(context, FactoryStringPool.get(context, "0.0.2" /* Creation failed, invalid factory parameters */));
            throw (ExceptionPreConditionViolation) null; // compiler insists
        }
    
        prepareInstanceAttributesFactory_CoreObject(context, instance);

        return instance;
    }
  
    public Object createObject    (CallContext context) throws ValidationFailure {
        return createCoreObject(context);
    }

    public void validate(CallContext context) throws ValidationFailure {
        validateFactory_CoreObject(context);
    }

    public void validateFactory_CoreObject(CallContext context) throws ValidationFailure {
        ValidationFailure vf = validateFactory_CoreObject(context, null);
        if (vf != null) { throw vf; }
    }

    protected ValidationFailure validateFactory_CoreObject(CallContext call_context, ValidationFailure vf) {
        return vf;
    }

    protected OSet_Object_Type_ accessory_o_set;

    public OSet_Object_Type_ getAccessorys(CallContext call_context) {
        return this.accessory_o_set;
    }

    public OSet_Object_Type_ defaultAccessorys(CallContext context) {
        return new OSetImpl_Object_Type_(context);
    }

    public void setAccessorys(CallContext call_context, OSet_Object_Type_ accessory_o_set) {
        this.accessory_o_set = accessory_o_set;
    }
}
