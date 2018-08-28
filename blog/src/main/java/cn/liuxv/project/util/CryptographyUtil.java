package cn.liuxv.project.util;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * created by liuxv on 2018/5/19
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public class CryptographyUtil {

    //Base64加密
    public static String encBase64(String str) {
        return Base64.encodeToString(str.getBytes());
    }

    //Base64解密
    public static String decBase64(String str) {
        return Base64.decodeToString(str);
    }

    //Md5加密
    public static String md5(String str,String salt) {
        return new Md5Hash(str,salt).toString();
    }

}
