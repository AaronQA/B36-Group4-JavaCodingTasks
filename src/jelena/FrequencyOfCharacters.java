package jelena;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


   String str1= "aaaabbbccd";
        Map<String, Integer>  result = FrequencyOfCharacters.frequencyOfChar(str1);
//      for (String character : result.keySet()) {
//          System.out.println(character + " : " + result.get(character));
//
//      }
        System.out.println(result);
    }

    public static  Map<String, Integer> frequencyOfChar(String str){
        Map<String, Integer> map = new HashMap<>();
        for(  Character each : str.toCharArray() ){
            if( map.containsKey(String.valueOf(each)) ){
                map.put(String.valueOf(each), map.get(String.valueOf(each)) + 1);
            }else {
                map.put(String.valueOf(each), 1);
            }

        }

        return map;
    }



}
