package com.sitech.tc.influencesystem.common;




import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;

/**
 * @Description 加密工具
 * @author JYH
 * 2019/2/28 9:56
 */
public class MD5Utils {

    /**
     * @Description: 对字符串进行md5加密
     */
    public static String getMD5Str(String strValue) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String newstr = Base64.encodeBase64String(md5.digest(strValue.getBytes()));
        return newstr;
    }

}
