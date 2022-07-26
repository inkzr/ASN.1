/**
 * Copyright iNK ZCrypto,LLP @2009. All Rights Reserved. This software is the
 * proprietary information of iNK ZCrypto LLP. Use is subject to license
 * terms.
 *
 * Project: CA-DED	
***/
/**
 * Package declaration
 */

package ink.jasn.ca.type.extern;

import ink.jasn.ca.type.base.ASNDefinedValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Packages and classes import
 */

/**
 * @Source : ASNOIDComponentList.java
 * @Author : Nirmal Kumar Biswas
 * @Date : Sep 10, 2009
 * @Time : 8:47:44 PM
 * @Version : $1.00
 */

public class ASNOIDComponentList
{
    public boolean isDefinitive;
    public ASNDefinedValue defval;
    public List<String> components;

    // Default Constructor
    public ASNOIDComponentList()
    {
        components = new ArrayList<String>();
    }

    // toString Method
    public String toString()
    {
        String ts = "";
        if( isDefinitive )
            ts += defval;
        if( components != null )
        {
            java.util.Iterator i = components.iterator();
            while( i.hasNext() )
            {
                ts += (i.next());
            }
        }
        return ts;
    }
}
