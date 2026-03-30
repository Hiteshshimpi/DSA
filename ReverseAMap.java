import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReverseAMap {
    public static void main(String[] args) {
        Map<String, Integer> hash = new HashMap<>();
        hash.put("Hitesh", 1);
        hash.put("Shimpi", 2);
        hash.put("Shivani", 3);
        System.out.println("Original Map : " + hash);
        Map<Integer,String> reverseHash = new HashMap<>();

        Iterator<Map.Entry<String,Integer>> it = hash.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,Integer> map = it.next();
            String key = map.getKey();
            Integer value = map.getValue();
            reverseHash.put(value,key);
        }
        System.out.println("Reverse Map : " + reverseHash);
        for(Map.Entry<Integer,String> map : reverseHash.entrySet())
        {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }


}
