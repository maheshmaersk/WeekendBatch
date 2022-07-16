package stringHandle;

import java.util.Locale;

public class StringsExample {

    public static void main(String[] args) {

        String mango = "Mango";
        String a = "Apple";
        String c = "Mango";

        String d = new String("Apple");
        String e = new String("Mango");

       /* if (c == e) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (mango == c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (c.equals(e)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }*/


        String abc = "Hello How are you";
        String abc1 = "Hello how ArE yOu";
        System.out.println(abc.trim());
        System.out.println(abc1.equalsIgnoreCase(abc));

        String[] sdf = abc.split(" ");
        System.out.println(sdf.length);
        System.out.println(abc.length());

        System.out.println(abc.substring(0,6));
        System.out.println(abc.toUpperCase(Locale.ROOT));
        System.out.println(abc.toLowerCase(Locale.ROOT));

        System.out.println(abc.concat(abc1));
        System.out.println(abc+" "+(abc1));
        System.out.println(abc.contains("How"));
        System.out.println(abc.charAt(3));
        System.out.println(abc.replace("How","Harsha"));
        System.out.println(abc.replace("How ",""));
        System.out.println(abc.startsWith("How"));
        System.out.println(abc.endsWith("you"));
        System.out.println(isPalindrome("nitin"));

    }


    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
