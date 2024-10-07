// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/many/v0001/origin/source/java/com/sphenon/basics/many/templates/Set.javatpl
// please do not modify this file directly
package com.sphenon.basics.accessory.tplinst;

import com.sphenon.basics.accessory.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.many.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

public interface Set_Accessory_
  extends ReadSet_Accessory_,
          WriteSet_Accessory_,
          Navigatable_Iterator_Accessory__,
          OfKnownSize
{
    public boolean contains (CallContext context, Accessory item);

    public void     set     (CallContext context, Accessory item);
    public void     add     (CallContext context, Accessory item) throws AlreadyExists;
    public void     replace (CallContext context, Accessory item) throws DoesNotExist;
    public void     unset   (CallContext context, Accessory item);
    public void     remove  (CallContext context, Accessory item) throws DoesNotExist;

    public Iterator_Accessory_ getNavigator (CallContext context);

    public long     getSize (CallContext context);
}

