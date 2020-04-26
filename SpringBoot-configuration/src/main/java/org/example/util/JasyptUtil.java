package org.example.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 15:34
 * @Description:
 */
public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("Hello");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root");
        System.out.println(username);
        System.out.println(password);
        //7w5xqmR82Ob0mk/QLnQKnA==
        //Xw3JGfpgvrkR7ZR6KUcGuw==
        //MWP4WSvIjLR0LGGUnJJWpA==
        //YWdRv3dF1/fkzzCP2AgHbw==

    }
}
