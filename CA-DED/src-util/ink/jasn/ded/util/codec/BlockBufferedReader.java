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
 * @Source 	 	 : BlockBufferedReader.java
 * @Description : SHORT DESCRIPTION ABOUT THE FILE
 * @Timeline 	 : Oct 23, 2013 12:38:48 PM
 * @Author 		 : iNK
 * @Version 	 : #1.00
 */

package ink.jasn.ded.util.codec;

import ink.jasn.ca.basis.central.CadedDataTreeNode;
import ink.jasn.ca.type.base.ASNCollection;
import ink.jasn.ca.type.base.ASNContainer;
import ink.jasn.ca.type.base.ASNDefinedType;
import ink.jasn.ca.type.base.ASNSelection;
import ink.jasn.ca.type.base.ASNType;
import ink.jasn.ca.type.base.Tag;
import ink.jasn.ca.type.impl.ASNAny;
import ink.jasn.ca.type.impl.ASNEnumerated;
import ink.jasn.com.exception.ASNException;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Date;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

public class BlockBufferedReader extends ASNDataReader
{

	private ASNDataReader asnDataReader;

	private InputStream currentStream;

	private boolean fillerToBeChecked;

	private byte[] blockBuffer = new byte[1024];

	/**
	 * @param in
	 * @throws IOException
	 */
	public BlockBufferedReader(ASNDataReader asnDataReader)
	{
		super();
		this.asnDataReader = asnDataReader;
	}

	/**
	 * @param fillerToBeChecked
	 *           the fillerToBeChecked to set
	 */
	public void setFillerToBeChecked(boolean fillerToBeChecked)
	{
		this.fillerToBeChecked = fillerToBeChecked;
	}

	/**
	 * @param asnDataReader
	 * @param blockSize
	 */
	public BlockBufferedReader(ASNDataReader asnDataReader, int blockSize)
	{
		super();
		this.asnDataReader = asnDataReader;
		if (blockSize > 0)
		{
			this.blockBuffer = new byte[blockSize];
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ink.jasn.ded.util.codec.ASNDataDecoder#decodeDefined(ink.jasn.ca.type.
	 * base.ASNDefinedType)
	 */
	@Override
	public CadedDataTreeNode<Object> decodeDefined(ASNDefinedType definedType)
				throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeDefined(definedType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ink.jasn.ded.util.codec.ASNDataDecoder#decodeContainer(ink.jasn.ca.type
	 * .base.ASNContainer)
	 */
	@Override
	public CadedDataTreeNode<Object> decodeContainer(ASNContainer containerType)
				throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeContainer(containerType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ink.jasn.ded.util.codec.ASNDataDecoder#decodeCollection(ink.jasn.ca.type
	 * .base.ASNCollection)
	 */
	@Override
	public CadedDataTreeNode<Object> decodeCollection(ASNCollection collectionType)
				throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeCollection(collectionType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ink.jasn.ded.util.codec.ASNDataDecoder#decodeSelection(ink.jasn.ca.type
	 * .base.ASNSelection)
	 */
	@Override
	public CadedDataTreeNode<Object> decodeSelection(ASNSelection selectionType)
				throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeSelection(selectionType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ink.jasn.ded.util.codec.ASNDataDecoder#decodeAny(ink.jasn.ca.type.impl
	 * .ASNAny)
	 */
	@Override
	public CadedDataTreeNode<Object> decodeAny(ASNAny anyType) throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeAny(anyType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeNull()
	 */
	@Override
	public ASNType decodeNull() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeNull();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeInteger()
	 */
	@Override
	public BigInteger decodeInteger() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeInteger();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeReal()
	 */
	@Override
	public Double decodeReal() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeReal();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeBitString()
	 */
	@Override
	public String decodeBitString() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeBitString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeOctetString()
	 */
	@Override
	public String decodeOctetString() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeOctetString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeString()
	 */
	@Override
	public String decodeString() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeBoolean()
	 */
	@Override
	public Boolean decodeBoolean() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeBoolean();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ink.jasn.ded.util.codec.ASNDataDecoder#decodeEnumerated(ink.jasn.ca.type
	 * .impl.ASNEnumerated)
	 */
	@Override
	public String decodeEnumerated(ASNEnumerated asnEnumerated) throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeEnumerated(asnEnumerated);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeObjectIdentifier()
	 */
	@Override
	public String decodeObjectIdentifier() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeObjectIdentifier();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ink.jasn.ded.util.codec.ASNDataDecoder#decodeRelativeObjectIdentifier()
	 */
	@Override
	public String decodeRelativeObjectIdentifier() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeRelativeObjectIdentifier();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeUTCTime()
	 */
	@Override
	public Date decodeUTCTime() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeUTCTime();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataDecoder#decodeGeneralizedTime()
	 */
	@Override
	public Date decodeGeneralizedTime() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.decodeGeneralizedTime();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataReader#readTag()
	 */
	@Override
	protected Tag readTag() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.getTag();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataReader#readLength()
	 */
	@Override
	protected int readLength() throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.getLength();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ink.jasn.ded.util.codec.ASNDataReader#readContent(int)
	 */
	@Override
	protected byte[] readContent(int length) throws Exception
	{
		// TODO Auto-generated method stub
		return asnDataReader.getContent();
	}

	/**
	 * TLV [ILC] Slider in a ASN.1 data channel to fetch serial data as [ T | L |
	 * T | L |.....| T | L | V ] format consecutively. Where T stands for TAG in
	 * data L stands for LENGTH for the DATA and V represents the DATA itself or
	 * VALUE.
	 * 
	 * @throws Exception
	 */
	public Boolean slide() throws Exception
	{
		if (!asnDataReader.hasMoreData())
		{
			refillBlock();
		}
		asnDataReader.slide();

		tag = readTag();
		if (tag.value() < 0 || tag.value() < 16383)
		{
			checkFiller();
		}

		length = readLength();
		if (!constructed)
			content = readContent(length);

		System.out.println("slider-out===> TAG-> " + tag.value() + "\t: LENGTH-> " + length
					+ "\t: VALUE-> "
					+ ((content != null) ? new String(content, "UTF-8") : null)
					+ " \t: POSITION-> " + count);
		return true;
	}

	/**
	 * 
	 * @throws ASNException
	 * @throws IOException
	 */
	private void refillBlock() throws ASNException, IOException
	{
		asnDataReader.read(blockBuffer);
		currentStream = new ByteInputStream(blockBuffer, blockBuffer.length);
	}

	/**
	 * TLV [ILC] Slider in a ASN.1 data channel to fetch serial data as [ T | L |
	 * T | L |.....| T | L | V ] format consecutively. Where T stands for TAG in
	 * data L stands for LENGTH for the DATA and V represents the DATA itself or
	 * VALUE.
	 * 
	 * @throws Exception
	 */
	public Boolean shift() throws Exception
	{
		tag = readTag();
		length = readLength();
		content = null;
		if (!constructed)
			content = readContent(length);

		System.out.println("sft-out|=> TAG-> " + tag.value() + "\t: LENGTH-> " + length
					+ "\t: VALUE-> "
					+ ((content != null) ? new String(content, "UTF-8") : null)
					+ " \t: POSITION-> " + count);
		return true;
	}

	public boolean checkFiller()
	{
		if (content == null)
			return false;
		for (int i = 0; i < length; i++)
		{
			if (content[i] != 0xFF && content[i] != 0x00)
				return false;
		}
		return true;
	}

}
