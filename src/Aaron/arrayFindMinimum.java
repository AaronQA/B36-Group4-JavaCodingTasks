package Aaron;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println(minValue(new int[]{150, 5, 8, 9, 15}));
        System.out.println(minValue(arr));
        min(arr);
    }

    public static int minValue(int[] num) {
        int min = Integer.MAX_VALUE;
        for (int each : num)
            if (each < min)
                min = each;
        return min;
    }

    public static void min(int[] num) {
        int min = num[0];
        for (int each : num) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);
    }


}