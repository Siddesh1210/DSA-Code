import java.util.HashMap;

public class AmazonOA9 {
    public static void main(String[] args) {
        String s="abbacc";
        String t="abc";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
        }
        // System.out.println(hm);
        int count=0;
        boolean flag=true;
        while(true)
        {
            for(int i=0;i<t.length();i++)
            {
                if(hm.containsKey(t.charAt(i)) && hm.get(t.charAt(i))>0)
                {
                    hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)-1);
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag==false) break;
            count++;
        }
        System.out.println(count);
    }
    
}
