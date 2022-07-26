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
 * @Source 	 	 : MSTReaderWriter.java
 * @Description : SHORT DESCRIPTION ABOUT THE FILE
 * @Timeline 	 : Jun 4, 2022 2:29:54 AM
 * @Author 		 : iNK
 * @Version 	 : #1.00
 */

package ink.jasn.ca.persist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ink.jasn.ca.type.base.ASNMaster;

public class MSTReaderWriter
{
	private String filename;

	/**
	 * @param filename
	 */
	public MSTReaderWriter(String filename)
	{
		super();
		this.filename = filename;
	}

	public void writeMST(ASNMaster masterNode)
	{
		try
		{
			FileOutputStream fileStream = new FileOutputStream(new File(filename));
			ObjectOutputStream objStream = new ObjectOutputStream(fileStream);

			// Write objects to file
			objStream.writeObject(masterNode);

			objStream.close();
			fileStream.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public ASNMaster readMST()
	{
		ASNMaster masterNode = null;
		try
		{
			FileInputStream fi = new FileInputStream(new File(filename));
			ObjectInputStream oi = new ObjectInputStream(fi);

			masterNode = (ASNMaster) oi.readObject();

			oi.close();
			fi.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return masterNode;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
