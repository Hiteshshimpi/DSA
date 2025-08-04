package DSA_2Pointers_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountTheWords {

    public static void main(String[] args) {
        HashMap<String,Integer> hash = new HashMap<>();
        String str = "New testing team has a new impact on testing due to new testing changes";
        String [] nwStr =str.split(" ");
        System.out.println(Arrays.toString(nwStr));

        for(int i =0;i<nwStr.length;i++)
        {
            if(!hash.containsKey(nwStr[i]))
            {
                hash.put(nwStr[i],1);
            }
            else
            {
                hash.put(nwStr[i],hash.get(nwStr[i])+1);
            }
        }
        System.out.println(hash);


        Iterator<Map.Entry<String,Integer>> it  = hash.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String ,Integer> map = it.next();
            System.out.println(map.getKey() +" occurs "+ map.getValue());
        }
    }
}
