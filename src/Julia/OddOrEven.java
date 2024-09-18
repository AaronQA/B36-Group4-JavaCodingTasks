package Julia;

public class OddOrEven {
    /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even" */

    public static void main(String[] args) {
        EvenOrOdd(5);
        EvenOrOdd(6);
    }
            public static void EvenOrOdd(int number){

            if (number % 2 == 0){
                System.out.println("Even number: " + number);
            } else {
                System.out.println("Odd number: " + number);
            }
        }
    }

