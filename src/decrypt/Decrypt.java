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
                        new FileInputStream("D:\\weakpass_2a\\weakpass_2a"), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {
                DTread one = new DTread(line);
                Thread thread1 = new Thread(one);
                Thread thread2 = new Thread(one);
                Thread thread3 = new Thread(one);
                Thread thread4 = new Thread(one);
                Thread thread5 = new Thread(one);
                Thread thread6 = new Thread(one);
                Thread thread7 = new Thread(one);
                Thread thread8 = new Thread(one);
                Thread thread9 = new Thread(one);
                Thread thread10 = new Thread(one);
//                Thread thread11 = new Thread(one);
//                Thread thread12 = new Thread(one);
//                Thread thread13 = new Thread(one);
//                Thread thread14 = new Thread(one);
//                Thread thread15 = new Thread(one);
//                Thread thread16 = new Thread(one);
//                Thread thread17 = new Thread(one);
//                Thread thread18 = new Thread(one);
//                Thread thread19 = new Thread(one);
//                Thread thread20 = new Thread(one);
//                Thread thread21 = new Thread(one);
//                Thread thread22 = new Thread(one);
//                Thread thread23 = new Thread(one);
//                Thread thread24 = new Thread(one);
//                Thread thread25 = new Thread(one);
//                Thread thread26 = new Thread(one);
//                Thread thread27 = new Thread(one);
//                Thread thread28 = new Thread(one);
//                Thread thread29 = new Thread(one);
//                Thread thread30 = new Thread(one);
//                Thread thread31 = new Thread(one);
//                Thread thread32 = new Thread(one);
//                Thread thread33 = new Thread(one);
//                Thread thread34 = new Thread(one);
//                Thread thread35 = new Thread(one);
//                Thread thread36 = new Thread(one);
//                Thread thread37 = new Thread(one);
//                Thread thread38 = new Thread(one);
//                Thread thread39 = new Thread(one);


                thread1.start();
                thread2.start();
               thread3.start();
                thread4.start();
                thread5.start();
                thread6.start();
                thread7.start();
                thread8.start();
                thread9.start();
                thread10.start();
//                thread11.start();
//                thread12.start();
//                thread13.start();
//                thread14.start();
//                thread15.start();
//                thread16.start();
//                thread17.start();
//                thread18.start();
//                thread19.start();
//                thread20.start();
//                thread21.start();
//                thread22.start();
//                thread23.start();
//                thread24.start();
//                thread25.start();
//                thread26.start();
//                thread27.start();
//                thread28.start();
//                thread29.start();
//                thread30.start();
//                thread31.start();
//                thread32.start();
//                thread33.start();
//                thread34.start();
//                thread35.start();
//                thread36.start();
//                thread37.start();
//                thread38.start();
//                thread39.start();
//                thread40.start();
//                thread41.start();
//                thread42.start();
//                thread43.start();
//                thread44.start();
//                thread45.start();
//                thread46.start();
//                thread47.start();
//                thread48.start();
//                thread49.start();
//                thread50.start();

            }
        } catch (IOException e) {
            // log error
        }




    }
    static class DTread implements Runnable{
        String line;
        public DTread(String line) {
            this.line = line;
        }

        @Override
        public void run() {
            if (md5Custom(line).equals("5f50dfa5385e66ce46ad8d08a9c9be68")) {
                System.out.println(line);
                System.out.println(LocalTime.now());

            }


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
