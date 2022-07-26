/**
 * Copyright iNK ZCrypto,LLP @2009. All Rights Reserved. This software is the
 * proprietary information of iNK ZCrypto LLP. Use is subject to license
 * terms.
 *
 * Project: CA-DED	
***/

/***********************************************************************************
 * Package Declaration :
 *  ---------------------
 */

package ink.jasn.ded.util.io;

/***********************************************************************************
 * Packages and Classes Import :
 * -----------------------------
 */

/**
 * Source : Slider.java 
 * Author : Nirmal Kumar Biswas 
 * Date : Mar 20, 2009 
 * Time : 1:19:57 PM 
 * Version : $0.01
 */

public interface Slider<D>
{
    D slide() throws Exception;
}
