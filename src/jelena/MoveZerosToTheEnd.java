package jelena;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/


    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveZeros(1,0,2,0,3,0,4,0)));
        System.out.println(Arrays.toString(moveZeros(22,0,-5,9,0,0,1111)));



    }
     public static int[] moveZeros(int... nums){

   int[] moved = new int[nums.length];
   int index = 0;                       //index++ se pomjera samo kad br nije nula

   for(int each : nums){                     //prolazi kroz sve values
       if(each != 0){                      //by default nule ce ici na kraj
       moved[index] = each;            //uzme prvu vrednost koje je predstavljena sa each
             index++;                            //i assign u moved arr na poziciji index
       }

   }

   return moved;
     }


}