import java.util.ArrayList;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String str[]={"code","doce","eodc","framer","frame"};
        list.add(str[0]); //first element will always be there in list
        for(int i=1;i<str.length;i++)
        {
            boolean ans=anagram(str[i-1],str[i]);
            if(ans==false) //if they are not anagram we are putting in list
            {
                list.add(str[i]);
            }
        }
        System.out.println((list));
    }

    public static boolean anagram(String s,String k)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        boolean flag=true;

        for(int i=0;i<k.length();i++)
        {
            if(hm.containsKey(k.charAt(i)))
            {
                hm.put(k.charAt(i),hm.getOrDefault(k.charAt(i),0)-1);
                if(hm.get(k.charAt(i))==0) hm.remove(k.charAt(i));
            }
            else
            {
                return false;
            }
        }
        if(flag==true && hm.size()==0) return true;
        else return false; 
    }
}
