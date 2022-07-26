/**
 * Copyright iNK ZCrypto,LLP @2009. All Rights Reserved. This software is the
 * proprietary information ofiNK ZCrypto LLP. Use is subject to license
 * terms.
 *
 * Project: CA-DED	
***/
/**
 * Package declaration
 */

package ink.jasn.com.exception;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Packages and classes import
 */

/**
 * @Source : MessageLookup.java
 * @Author : Nirmal Kumar Biswas
 * @Date : Oct 28, 2009
 * @Time : 12:36:36 PM
 * @Version : $1.00
 */

public class MessageLookup
{
    private static ResourceBundle bundle = ResourceBundle.getBundle( "ink.jasn.com.exception.ASNErrorCodes",
                                                                     Locale.getDefault() );

    public static String lookup( String errorCode )
    {
        try
        {
            String message = bundle.getString( errorCode );
            return ASNErrorCodes.CodePrefix + errorCode + ": " + message;
        } catch( Exception e )
        {
            return ASNErrorCodes.CodePrefix + ASNErrorCodes.LOOKUP_BAD_KEY
                   + "BAD-MESSAGE-LOOKUP !!! V1 [ Undefined lookup key provided in message lookup for ASN exception. ]";
        }

    }

    public static String lookup( String errorCode, Object[] fillers )
    {
        String message = bundle.getString( errorCode );

        try
        {
            MessageFormat msgFormatter = new MessageFormat( message );
            return ASNErrorCodes.CodePrefix + errorCode + ": " + msgFormatter.format( fillers );
        } catch( Exception e )
        {
            return ASNErrorCodes.CodePrefix + ASNErrorCodes.LOOKUP_BAD_KEY
                   + "BAD-MESSAGE-LOOKUP !!! V2 [ Undefined lookup key provided in message lookup for ASN exception. ]";

        }
    }

    public static void main( String[] args )
    {
        System.out.println( "MessageLookup.main()--- >" + lookup(""+ ASNErrorCodes.CODEC_BADLY_ENCODED_DATA) );
    }
}
