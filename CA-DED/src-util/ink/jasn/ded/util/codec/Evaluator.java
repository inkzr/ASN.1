
/**
 * Copyright iNK ZCrypto,LLP @2009. All Rights Reserved. This software is the
 * proprietary information ofiNK ZCrypto LLP. Use is subject to license
 * terms.
 *
 * Project: CA-DED	
***/

/***
 * Package Declaration :
 *---------------------*/
 package ink.jasn.ded.util.codec;

/***
 * Packages and Classes Import :
 *-----------------------------*/

/**
 * Source  : Evaluator.java
 * Author  : Nirmal Kumar Biswas
 * Date    : Jul 22, 2009
 * Time    : 12:34:09 PM
 * Version : $0.01
 **/
public interface Evaluator<T,D>
{
    T evaluate(D d);
}
