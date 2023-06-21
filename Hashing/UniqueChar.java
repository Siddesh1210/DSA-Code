import java.util.HashMap;

public class UniqueChar {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm =new HashMap<>();
        String s="leetcode";
        // for(int i=0;i<s.length();i++)
        // {
        //     hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0;i<s.length();i++)
        // {
        //     if(hm.get(s.charAt(i))==1) System.out.println("Unique Element is:"+i);
        // }
        for(int i=0;i<s.length();i++)
        {
            String k=""+s.charAt(i);
            if(!s.substring(i+1,s.length()).contains(k))
            {
                System.out.println("Unique element is : "+s.charAt(i));
            }
        }
        
    }
}
