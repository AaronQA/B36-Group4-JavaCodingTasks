package Julia;

public class OddOrEven {
    /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/
  //Solution

    public static void main(String[] args) {
        int array[]= {5,6};
        for(int i=0;i<array.length;i++){
            if(array[i] % 2==0) {
                System.out.println("Even number: "+array[i]);
            }else{
                System.out.println("Odd number: "+array[i]);
            }
        }
    }
}
