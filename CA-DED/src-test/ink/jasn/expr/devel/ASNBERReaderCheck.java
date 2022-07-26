/**
 * 
 */
package ink.jasn.expr.devel;

import java.io.FileWriter;
import java.io.IOException;

import ink.jasn.ded.util.codec.ASNDataReader;
import ink.jasn.ded.util.io.DataReaderFactory;

/*
 * This is a proprietary information of ZCrypto.
 * All the copyright is reserved for ZCrypto. (2013)
 *
 * Any information uses from ZCrypto are subject to the term and condition 
 * together with a valid license agreement made in-between.
 *
 * @Source : ASNBERReaderCheck.java
 * @Description :
 * @Timeline : Jul 20, 2013 11:37:11 AM
 * @Author : iNK
 * @Version : #1.00
 */

public class ASNBERReaderCheck
{

	private ASNDataReader dr;

	/**
	 * 
	 */
	public ASNBERReaderCheck()
	{
		dr = DataReaderFactory.getASNDataReader("BER");
		// asnbbr.setBlockSize(2048);
		// asnbbr.setFillerCheck(true);
		// dr = asnbbr;
	}

	/**
	 * @throws Exception
	 * 
	 */
	private void parseWithBer(String fileName) throws Exception
	{
		try
		{
			dr.fixNewFile(fileName);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		FileWriter f = new FileWriter(
					"C:\\OuterSpace\\Zamtell\\Zamtel Mediation\\vvsec/TLV.TXT");
		try
		{
			while (dr.hasMoreData())
			{
				dr.shift(f);
			}
		}
		finally
		{
			f.close();
		}

	}

	public static void main(String[] args)
	{
		try
		{
			new ASNBERReaderCheck().parseWithBer(
						"C:\\\\Experiment\\\\CA-DED\\\\resource-test\\B2021120113799.dat");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
