package Serge;

public class reverse {
    /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/


    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }



  public static String reverseString(String input){

      String output="";

      for (int i = input.length()-1; i >= 0; i--) {
          output += input.charAt(i);
      }

      return output;
  }

}