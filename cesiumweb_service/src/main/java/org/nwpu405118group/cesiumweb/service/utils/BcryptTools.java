package org.nwpu405118group.cesiumweb.service.utils;


import org.mindrot.jbcrypt.BCrypt;

public class BcryptTools {
    public static String encoder(String originPassword, Integer number) {
        if (number == null || number == 0) {
            number = 10;
        }
        return BCrypt.hashpw(originPassword, BCrypt.gensalt(number));
    }
    public static Boolean match(String originPassword, String encodePassword){
        return BCrypt.checkpw(originPassword, encodePassword);
    }

//    public static void main(String[] args) {
//        System.out.println(encoder("123456",null));
//        System.out.println(match("123456", encoder("123456",null)));
//        System.out.println(match("1234567", encoder("123456",null)));
//    }
}
