package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str="ababcdcd";
        StringBuilder sb=new StringBuilder();
       HashMap<Character,Integer> map=new HashMap<>();
         for(int i=0;i<str.length();i++)
         {
                if(map.containsKey(str.charAt(i)))
                {
                    sb.append(str.charAt(i));
                }
                else
                {
                    map.put(str.charAt(i),1);
                }
         }
        System.out.println(map);

//         for(Map.Entry<Character,Integer> entry:map.entrySet())
//         {
//                char key=entry.getKey();
//                sb.append(key);
//         }
        System.out.println(sb.toString());
    }
}
