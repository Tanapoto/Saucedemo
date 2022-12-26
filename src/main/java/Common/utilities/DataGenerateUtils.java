package Common.utilities;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;
public class DataGenerateUtils {

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom random = new SecureRandom();

    public static String randomString(int len){
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++){
            sb.append(AB.charAt(random.nextInt(AB.length())));
        }
        return sb.toString();
    }


    public static int randomNumberIntFromTo(int from, int to){
        return (int) Math.floor(Math.random() * (to - from + 1) + from);
    }

    //UUID: Universally Unique IDentifier
    public static String randomStringUUID() {
        return UUID.randomUUID().toString();
    }
}
