import java.util.HashMap;

public class Practice {
   public static void main(String[] args) {
    String s="dwmodizxvvbosxxw";
    String dictionary[]={"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"};
    HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<dictionary.length;i++)
        {
            for(int j=0;j<dictionary[i].length();j++)
            {
                if(!hm.containsKey(dictionary[i].charAt(j))) hm.put(dictionary[i].charAt(j),1);
            }
        }
        
        int extra=0;

        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i))) extra++;
        }
        // return extra;
        System.out.println(hm);
        System.out.println(extra);
   } 
}
