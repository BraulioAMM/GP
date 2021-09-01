package com.company.utils;

/**
 * This class is used to encrypt the user passwords
 * 
 * @author Manuel Avila Rodriguez
 */
public class PasswordEncryption {
    public static String getHash(String text, String hashType) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(hashType);
            byte[] array = messageDigest.digest(text.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * This metod is used to encrypt a string in MD5
     * 
     * @return MD5 hash from a text.
     */
    public static String md5(String txt) {
        return PasswordEncryption.getHash(txt, "MD5");
    }

    /**
     * @return SHA1 hash from a text.
     */
    public static String sha1(String txt) {
        return PasswordEncryption.getHash(txt, "SHA1");
    }
}
