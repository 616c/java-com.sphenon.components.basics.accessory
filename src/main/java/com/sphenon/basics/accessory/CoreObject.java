package com.sphenon.basics.accessory;

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
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.metadata.tplinst.*;

import com.sphenon.basics.accessory.tplinst.*;

public interface CoreObject {
    /**
     * Retrieve an OSet of accessories attached to this instance. Components
     * must only register their "own" accessory types, i.e. types declared
     * within their scope. E.g., no component shall attach an accessory of,
     * say, type "String".
     *
     * returns The OSet of accessories
     */
    public OSet_Object_Type_ getAccessorys(CallContext call_context);
}
