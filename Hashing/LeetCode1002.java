import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode1002 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();

        String words[]={"cool","lock","cook"};
        for(int i=0;i<words[0].length();i++)
        {
            hm.put(words[0].charAt(i),hm.getOrDefault(words[0].charAt(i),0)+1);
        }
        // System.out.println(hm+" - HashMap");

        for(int i=1;i<words.length;i++)
        {
            HashMap<Character,Integer> freqHashMap=new HashMap<>();
            for(int j=0;j<words[i].length();j++)
            {
                freqHashMap.put(words[i].charAt(j),freqHashMap.getOrDefault(words[i].charAt(j),0)+1);
            }
            // System.out.println(freqHashMap+" - FreqMap for "+words[i]);
            for(Character key : hm.keySet())
            {
                int min=Math.min(hm.getOrDefault(key,0),freqHashMap.getOrDefault(key,0));
                hm.put(key,min);
            }
            // System.out.println(hm+" - HashMap");
        }
        ArrayList<String> list=new ArrayList<>();
        for(Character key : hm.keySet())
        {
            for(int i=1;i<=hm.get(key);i++)
            {
                String temp=""+key;
                list.add(temp);
            }
        }
        System.out.println(hm);
        System.out.println(list);
    }
}
