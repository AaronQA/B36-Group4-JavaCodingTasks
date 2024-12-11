package Aaron;

public class test {
    public static void main(String[] args) {
    String str = "abcdafghkcdddd";
   // System.out.println(frequencyOfChar(str, 'd'));
    frequencyOfChar(str, 'd');
    //output -> frequency of char 'd' is 5
}
   /* public static int frequencyOfChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }*/
    public static void frequencyOfChar(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("frequency of char '" + ch  + "' is " + count);

    }
}
