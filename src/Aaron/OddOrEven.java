package Aaron;

public class OddOrEven {
    public static void main(String[] args) {

        System.out.println(oddOrEven(5));
        System.out.println(oddOrEven(6));

    }
    /*Write  a method which can identify given int number is even or odd
 Output ex:
 identify(5); ->"Odd"
 identify(6); ->"Even"*/
    //Solution:
    public static String oddOrEven(int n) {
        String result = "";
        if( n % 2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }

        return result;

    }


}
