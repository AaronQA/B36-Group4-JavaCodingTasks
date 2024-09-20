package jelena;

public class OddOrEven {
    /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/
    //Solution public static String identify(int number) {


    // Solution
    public static void main(String[] args) {
        identify(5);
        identify(6);
    }

    public static void identify(int num) {

        boolean isEven = num % 2 == 0;
        String evenOrOdd = (isEven) ? "Even" : "Odd";
        System.out.println(evenOrOdd);




    }

}












