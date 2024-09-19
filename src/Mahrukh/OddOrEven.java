package Mahrukh;

public class OddOrEven {
    /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    // Solution
    public static void main(String[] args) {
        identify(5);
        identify(6);
    }

    public static void identify(int num){

        boolean isEven = num % 2 == 0;                      // boolean condition to check if even
        String evenOrOdd = (isEven) ? "Even" : "Odd";       // ternary if else statement
        System.out.println(evenOrOdd);                      // print the result

        // talk about benefits of custom methods
        // calling it whenever we want

        // when to start
        // sprint - tasks - work - teammates - 2 weeks notice - cannot leave right away

        // why leaving job rn
        // - relocation?
        // - remote job -> in office so cant relocate
        // - hired for this project, PO

        // salary - expectation
        // - what is the budget of this role?
        // - do not right away give a number
        // i researched the role in california for this position with my experience and skills
        // i am a menttor in my team, i am a team lead, i came up with a number with someone with my expeirnece and the rangee is between (110 - 130K)
        // I believe i shoulld be getting somewhere around the higher end of it
        // do not say no right away - ask about opportunity to grow, PTO, etc. do not close the door
    }
}
