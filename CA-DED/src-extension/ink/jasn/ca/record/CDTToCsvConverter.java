/*
 * 
 * Copyright 2013 ZCrypto, All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, without modification, 
 * are permitted subject to the following conditions:
 *
 * 1. Any use in source and binary forms must have a valid license from ZCrypto.
 *
 * 2. Redistributions of source code must retain the above copyright notice together with a valid license 
 *	   agreement and this list of conditions and the following disclaimer.
 *
 *	3. Redistributions in binary form must reproduce the above copyright notice together with a valid license 
 *	   agreement and this list of conditions and the following disclaimer in the documentation and/or other 
 * 	materials provided with the distribution.
 *
 * 4. Any short of use to endorse or promote products are not permitted without any prior written permission
 *		from ZCrypto.
 *
 * @Vertical 	 : Telecommunication   
 *	@Project  	 : Compiler for ASN with Data Encoder and Decoder (CA-DED)
 * @Source 	 	 : MTVToCsvConverter.java
 * @Description : SHORT DESCRIPTION ABOUT THE FILE
 * @Timeline 	 : Jun 6, 2022 12:43:12 AM
 * @Author 		 : iNK
 * @Version 	 : #1.00
 */

package ink.jasn.ca.record;

import javax.management.loading.PrivateClassLoader;

import ink.generic.data.definition.DataRecord;
import ink.jasn.ca.basis.central.CadedDataTreeNode;

public class CDTToCsvConverter implements TreeDataAdapter
{

	private CadedDataTreeNode<String> cadedDataTreeNode;

	/**
	 * @param cadedDataTreeNode
	 */
	public CDTToCsvConverter(CadedDataTreeNode<String> cadedDataTreeNode)
	{
		super();
		this.cadedDataTreeNode = cadedDataTreeNode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ca.record.TreeDataAdapter#convert(ink.jasn.ca.basis.central.
	 * CadedDataTreeNode)
	 */
	@Override
	public String convert(CadedDataTreeNode<String> cadedDataTreeNode)
	{
		return cadedDataTreeNode.toCsv();
	}

}
