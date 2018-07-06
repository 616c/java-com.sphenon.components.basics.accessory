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
import com.sphenon.basics.monitoring.*;
import com.sphenon.basics.validation.returncodes.*;

import com.sphenon.basics.accessory.*;
import com.sphenon.basics.accessory.tplinst.*;

import java.util.Vector;

public class Class_MonitorableCoreObject extends Class_CoreObject implements MonitorableCoreObject, ProblemMonitor {

    public Class_MonitorableCoreObject() {
    }

    public Class_MonitorableCoreObject(CallContext context) {
    }

    public void initialiseClass_MonitorableCoreObject (CallContext call_context) {
    }

    protected boolean is_destroyed = false;

    public boolean getIsDestroyed(CallContext context) {
        return this.is_destroyed;
    }

    public void destroy (CallContext context) {
        if (!this.is_destroyed) {
            this.is_destroyed = true;
            this.destroyClass_MonitorableCoreObject(context);
        }
    }

    public ValidationFailure canDestroy (CallContext context) {
        return null;
    }

    protected void destroyClass_MonitorableCoreObject (CallContext context) {
    }
  
    public void finalize () throws Throwable {
        this.destroy(RootContext.getDestructionContext());
    }

    public void validateinstanceClass_MonitorableCoreObject(CallContext context) throws ValidationFailure {
    }
    
    protected ValidationFailure validateinstanceClass_MonitorableCoreObject(CallContext call_context, ValidationFailure vf) {
        return vf;
    }

    public void validate(CallContext call_context) throws ValidationFailure {
    }

    // ONLY SINGLE INHERITANCE, WE HAVE TO REPEAT THIS HERE FROM MONITORABLE CLASS

    protected Vector<ProblemStatus> problem_status_details;

    public Vector<ProblemStatus> getProblemStatusDetails(CallContext context) {
        return this.problem_status_details;
    }

    public ProblemState getProblemState(CallContext context) {
        ProblemState problem_state = ProblemState.OK;
        if (this.problem_status_details != null) {
            for (ProblemStatus ps : this.problem_status_details) {
                problem_state = problem_state.combineWith(context, ps.getProblemState(context));
            }
        }
        return problem_state;
    }

    public void addProblemStatus(CallContext context, ProblemStatus problem_status) {
        if (this.problem_status_details == null) {
            this.problem_status_details = new Vector<ProblemStatus>();
        }
        this.problem_status_details.add(problem_status);
    }

    public void addProblemStatus(CallContext context, ProblemState problem_state, Problem problem) {
        this.addProblemStatus(context, new ProblemStatus(context, problem_state, problem));
    }

    public void addProblemStatus(CallContext context, ProblemState problem_state, String message) {
        this.addProblemStatus(context, new ProblemStatus(context, problem_state, message));
    }

    public void addProblemStatus(CallContext context, ProblemState problem_state, Throwable exception) {
        this.addProblemStatus(context, new ProblemStatus(context, problem_state, exception));
    }

    public void addProblemStatus(CallContext context, ProblemState problem_state, int return_code) {
        this.addProblemStatus(context, new ProblemStatus(context, problem_state, return_code));
    }

    public void transferProblemsTo(CallContext context, ProblemMonitor target) {
        if (this.problem_status_details != null) {
            for (ProblemStatus ps : this.problem_status_details) {
                target.addProblemStatus(context, ps);
            }
        }
    }
}
