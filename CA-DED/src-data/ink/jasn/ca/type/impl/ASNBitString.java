/**
 * Copyright Connectiva Systems, Inc @2009. All Rights Reserved. This software is the proprietary
 * information of Connectiva Systems, Inc. Use is subject to license terms.
 * @Project: ParserGenX
 ***/

/***
 * Package Declaration :
 *@PKGS---------------------
 */

package ink.jasn.ca.type.impl;


/***
 * Packages and Classes Import :
 *@IMPRT-----------------------------
 */
import ink.jasn.ca.basis.central.CadedDataTreeNode;
import ink.jasn.ca.type.base.ASNPrimitive;
import ink.jasn.ca.type.base.Tag;
import ink.jasn.ca.type.extern.ASNNamedNumber;
import ink.jasn.ca.type.grammar.AsnConstraint;
import ink.jasn.ded.util.codec.ASNDataReader;
import ink.jasn.ded.util.codec.ASNDataWriter;


/**
 * @Source : BitString.java
 * @Author : Nirmal Kumar Biswas
 * @Date : Jul 29, 2009
 * @Time : 12:43:11 PM
 * @Version : $0.01
 **/
public class ASNBitString extends ASNPrimitive
{
    private static final long serialVersionUID = -7238542551216198148L;
    // public AsnNamedNumberList namedNumberList;

    public ASNNamedNumber asnNamedNumber;
    public AsnConstraint constraint;
    final String BUILTINTYPE = "BIT STRING";

    private final String TYPE_STRING = "BIT STRING";

    {
        type = TYPE_STRING;
        tagUniv = new Tag( Tag.TAG_VALUE_BIT_STRING );
    }

    /**
     * 
     */
    public ASNBitString()
    {
        super( "" );
        type = TYPE_STRING;
    }

    /**
     * @param name
     */
    public ASNBitString( String name )
    {
        super( name );
    }

    /**
     * @param name
     * @param tag
     */
    public ASNBitString( String name, Tag tag )
    {
        super( name, tag );
    }

    /**
     * @param name
     * @param tag
     * @param optional
     */
    public ASNBitString( String name, Tag tag, boolean optional )
    {
        super( name, tag, optional );
    }

    @Override
    public CadedDataTreeNode<Object> decode( ASNDataReader asnDataReader ) throws Exception
    {
        CadedDataTreeNode<Object> mvtNode = new CadedDataTreeNode<Object>( name );
        mvtNode.setData( asnDataReader.decodeBitString() );
        return mvtNode;
    }

    @Override
    public CadedDataTreeNode<Object> encode( ASNDataWriter asnDataWriter ) throws Exception
    {
        return null;
    }
}
