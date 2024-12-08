package jelena;

import java.sql.SQLOutput;

public class ReverseString {

    public static void main(String[] args) {
     //write a return method that can reverse string Reverse("ABCD")-->DCBA
        System.out.println(reverseMethod("ABCD"));
        System.out.println(reverseMethod("1234"));
        System.out.println(reverseMethod("#$%^"));


    }


    public static String reverseMethod(String str){

        String result = "";
        for( int i=str.length()-1 ;  i >=0; i-- ){
            char ch = str.charAt(i);
                 result = result+ch;
        }
        return result;
    }
}
