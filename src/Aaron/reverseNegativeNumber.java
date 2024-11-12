package Aaron;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
    public static void main(String[] args) {
        System.out.println(reverseNumber(-35));
    }

    public static int reverseNumber(int number){
        if(number < 10 && number >= 0){
            return number * -1;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }

    //alternative solution
    //converts&returns int num to a String so that we can handle -50 -> -5 issue because int does not have 0 before a number
    public static String reverseNum(int num) {

        String str = new StringBuilder("" + num).reverse().toString();

        if (num < 0) {
            str = "-" + str.substring(0, str.length() - 1);
        }

        return str;
    }


}

