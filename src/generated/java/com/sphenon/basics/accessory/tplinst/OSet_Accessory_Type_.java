// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/many/v0001/origin/source/java/com/sphenon/basics/many/templates/OSet.javatpl
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

