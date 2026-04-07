import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EncodingOfString {
    public static void main(String args[]) {
        String s = "ddmmmmtta";
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();
        for(char c : s.toCharArray())
        {
            if(!hash.containsKey(c))
            {
                hash.put(c,1);
            }
            else{
               hash.put(c,hash.get(c)+1);
            }
        }
        System.out.println(hash);

    }


}
