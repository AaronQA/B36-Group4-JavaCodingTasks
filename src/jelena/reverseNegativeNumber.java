package jelena;

public class reverseNegativeNumber {


    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {

        System.out.println( reversedNegativeNumber(-35));


    }

      public static int reversedNegativeNumber(int number){

        boolean negative = false; //we do this to declare if the number is negative
        if(number < 0){
            negative = true;
            number = -number;
        }
        String value = "" + number;//to convert integer to string

          String results = "";
          for(int i = value.length()-1; i >= 0; i--){
              results += value.charAt(i);//it will take char from that place and add to the results
          }

          int result = Integer.parseInt(results);//convert integer to string

          if(negative){           //to return negative sign if it is correct
              result = -result;
          }
          return result;
      }

}