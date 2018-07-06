// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/many/v0001/origin/source/java/com/sphenon/basics/many/templates/OSet.javatpl

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
// please do not modify this file directly
package com.sphenon.basics.accessory.tplinst;

import com.sphenon.basics.accessory.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.many.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

public interface OSet_Accessory_Type_
  extends ReadMap_Set_Accessory__Type_,
          WriteSet_Accessory_,
          Navigatable_Iterator_Accessory__,
          OfKnownSize
{
    public Set_Accessory_ get        (CallContext context, Type index) throws DoesNotExist;
    public Set_Accessory_ tryGet     (CallContext context, Type index);
    public boolean       canGet     (CallContext context, Type index);

    public Set_Accessory_ getMany    (CallContext context, Type index) throws DoesNotExist;
    public Set_Accessory_ tryGetMany (CallContext context, Type index);
    public boolean       canGetMany (CallContext context, Type index);

    public Accessory      getSole    (CallContext context, Type index) throws DoesNotExist, MoreThanOne;
    public Accessory      tryGetSole (CallContext context, Type index);
    public boolean       canGetSole (CallContext context, Type index);

    public void          set        (CallContext context, Accessory item);
    public void          add        (CallContext context, Accessory item) throws AlreadyExists;
    public void          replace    (CallContext context, Accessory item) throws DoesNotExist;
    public void          unset      (CallContext context, Accessory item);
    public void          remove     (CallContext context, Accessory item) throws DoesNotExist;

    public Iterator_Accessory_ getNavigator (CallContext context);

    public long          getSize (CallContext context);
}
