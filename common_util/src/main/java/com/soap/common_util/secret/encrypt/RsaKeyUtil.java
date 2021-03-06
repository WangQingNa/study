package com.soap.common_util.secret.encrypt;

import sun.misc.BASE64Decoder;
import java.io.IOException;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;


@SuppressWarnings("restriction")
public class RsaKeyUtil {

    
    
    public static KeyPair genKeyPair(){
        KeyPairGenerator keyPairGen= null;
        try {
            keyPairGen= KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        keyPairGen.initialize(2048, new SecureRandom());
        return keyPairGen.generateKeyPair();
    }
    
    
    public static String publicKey2String(Key key) throws NoSuchAlgorithmException, InvalidKeySpecException{
        
        sun.misc.BASE64Encoder base64encoder = new sun.misc.BASE64Encoder();
        KeyFactory keyFactory= KeyFactory.getInstance("RSA");
        X509EncodedKeySpec x509EncodedKeySpec = keyFactory.getKeySpec(key, X509EncodedKeySpec.class);
        byte[] buffer1 = x509EncodedKeySpec.getEncoded();
        
        return base64encoder.encode(buffer1);
    }
    
    
    
    public static String privateKey2String(Key key) throws NoSuchAlgorithmException, InvalidKeySpecException{
        
        sun.misc.BASE64Encoder base64encoder = new sun.misc.BASE64Encoder();
        KeyFactory keyFactory= KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = keyFactory.getKeySpec(key, PKCS8EncodedKeySpec.class);
        byte[] buffer1 = pKCS8EncodedKeySpec.getEncoded();
        
        return base64encoder.encode(buffer1);
    }
    
    
    
    
    
    
    public static RSAPrivateKey string2privateKey(String privateKeyStr) throws Exception{
        try {
            BASE64Decoder base64Decoder= new BASE64Decoder();
            byte[] buffer= base64Decoder.decodeBuffer(privateKeyStr);
            PKCS8EncodedKeySpec keySpec= new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory= KeyFactory.getInstance("RSA");
            return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("????????????");
        } catch (InvalidKeySpecException e) {
            throw new Exception("????????????");
        } catch (IOException e) {
            throw new Exception("??????????????????????????????");
        } catch (NullPointerException e) {
            throw new Exception("??????????????????");
        }
    }

    /**
     * ???????????????????????????
     * @param publicKeyStr ?????????????????????
     * @throws Exception ??????????????????????????????
     */
    public static RSAPublicKey string2publicKey(String publicKeyStr) throws Exception{
        try {
            BASE64Decoder base64Decoder= new BASE64Decoder();
            byte[] buffer= base64Decoder.decodeBuffer(publicKeyStr);
            KeyFactory keyFactory= KeyFactory.getInstance("RSA");
            X509EncodedKeySpec keySpec= new X509EncodedKeySpec(buffer);
            return (RSAPublicKey) keyFactory.generatePublic(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("????????????");
        } catch (InvalidKeySpecException e) {
            throw new Exception("????????????");
        } catch (IOException e) {
            throw new Exception("??????????????????????????????");
        } catch (NullPointerException e) {
            throw new Exception("??????????????????");
        }
    }
}
