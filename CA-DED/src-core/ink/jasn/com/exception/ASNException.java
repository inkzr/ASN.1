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

/**
 * Packages and classes import
 */

/**
 * @Source  : ASNException.java
 * @Author  : Nirmal Kumar Biswas
 * @Date    : Oct 28, 2009
 * @Time    : 12:33:04 PM
 * @Version : $1.00
 **/

public class ASNException extends Exception
{
    private static final long serialVersionUID = -880442746106793374L;

    public ASNException( int errorCode )
    {
        super( MessageLookup.lookup( String.valueOf( errorCode ) ) );
    }

    public ASNException( int errorCode, Exception cause )
    {
        super( MessageLookup.lookup( String.valueOf( errorCode ) ), cause );
    }


    public ASNException( int errorCode, Object[] fillers )
    {
        super( MessageLookup.lookup( String.valueOf( errorCode ), fillers ) );
    }

    public ASNException( int errorCode, Object[] fillers, Exception cause )
    {
        super( MessageLookup.lookup( String.valueOf( errorCode ), fillers ), cause );
    }

}
