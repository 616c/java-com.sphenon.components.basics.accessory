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

public class Factory_MonitorableCoreObject implements Factory {

    private Class_MonitorableCoreObject internal_instance;

    public Factory_MonitorableCoreObject (CallContext call_context) {
    }

    public Factory_MonitorableCoreObject () {
    }

    protected boolean final_validation_required = true;

    public void reset (CallContext context) {
        this.internal_instance = null;
        accessory_o_set = null;
    }

    protected void prepareInstanceAttributesFactory_MonitorableCoreObject (CallContext context, Class_MonitorableCoreObject instance) {
        instance.setAccessorys(context, this.getAccessorys(context));
    }

    public void confirmAttributes_Factory_MonitorableCoreObject(CallContext call_context) {
    }

    public void confirmAttributes(CallContext context) {
        confirmAttributes_Factory_MonitorableCoreObject(context);
    }

    public void validateFinally_Factory_MonitorableCoreObject(CallContext call_context) throws ValidationFailure {
    }

    public void validateFinally(CallContext call_context) throws ValidationFailure {
    }
  
    public MonitorableCoreObject precreateMonitorableCoreObject (CallContext context) {
        if (this.internal_instance == null) {
            this.internal_instance = new Class_MonitorableCoreObject(context);
        }
        return this.internal_instance;
    }

    public MonitorableCoreObject createMonitorableCoreObject (CallContext context) throws ValidationFailure {
        Class_MonitorableCoreObject instance = this.internal_instance;
        this.internal_instance = null;
        if (instance == null) {
            instance = new Class_MonitorableCoreObject(context);
        }

        confirmAttributes(context);

        validateFactory_MonitorableCoreObject(context); // might throw validation error.
        validateFinally(context);
   

        prepareInstanceAttributesFactory_MonitorableCoreObject(context, instance);

        return instance;
    }

    public MonitorableCoreObject mustCreateMonitorableCoreObject (CallContext context) {
        Class_MonitorableCoreObject instance = this.internal_instance;
        this.internal_instance = null;
        if (instance == null) {
            instance = new Class_MonitorableCoreObject(context);
        }

        confirmAttributes(context);

        try {
            validateFactory_MonitorableCoreObject(context);
            validateFinally(context);
        } catch (ValidationFailure vf) {
            CustomaryContext.create((Context)context).throwPreConditionViolation(context, FactoryStringPool.get(context, "0.0.2" /* Creation failed, invalid factory parameters */));
            throw (ExceptionPreConditionViolation) null; // compiler insists
        }
    
        prepareInstanceAttributesFactory_MonitorableCoreObject(context, instance);

        return instance;
    }
  
    public Object createObject    (CallContext context) throws ValidationFailure {
        return createMonitorableCoreObject(context);
    }

    public void validate(CallContext context) throws ValidationFailure {
        validateFactory_MonitorableCoreObject(context);
    }

    public void validateFactory_MonitorableCoreObject(CallContext context) throws ValidationFailure {
        ValidationFailure vf = validateFactory_MonitorableCoreObject(context, null);
        if (vf != null) { throw vf; }
    }

    protected ValidationFailure validateFactory_MonitorableCoreObject(CallContext call_context, ValidationFailure vf) {
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
