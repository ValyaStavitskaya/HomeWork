package decrypt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;


public class Decrypt {
    public static void main(String[] args) {

        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
//        for (int i = 0; i <308915776 ; i++) {
//            String s = generateRandomWord(6);
//            map.put(md5Custom(s),s);
//        }
       // System.out.println(map.get("5ebe2294ecd0e0f08eab7690d2a6ee69"));
//        System.out.println(md5Custom("very"));
//        //while(true) {
//            String s = generateRandomWord(4);
//        System.out.println(s);
            //if (md5Custom(s).equals("f016441d00c16c9b912d05e9d81d894d")) {
            //    System.out.println(s);
              //  break;
            //}
        //}
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("D:\\weakpass_2a\\weakpass_2a~\\weakpass_2a"), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {
                if (md5Custom(line).equals("5f50dfa5385e66ce46ad8d08a9c9be68")){
                System.out.println(line);
                    System.out.println(LocalTime.now());
                break;}

            }
        } catch (IOException e) {
            // log error
        }




    }

    static String generateRandomWord(int wordLength) {
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder(wordLength);
        for(int i = 0; i < wordLength; i++) { // For each letter in the word
            char tmp = (char) ('a' + r.nextInt(26)); // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }

    public static String md5Custom(String st) {
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(st.getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            // тут можно обработать ошибку
            // возникает она если в передаваемый алгоритм в getInstance(,,,) не существует
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while( md5Hex.length() < 32 ){
            md5Hex = "0" + md5Hex;
        }

        return md5Hex;
    }
}
