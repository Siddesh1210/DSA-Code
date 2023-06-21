import java.util.HashMap;

public class OA1 {
    public static void main(String[] args) {
        String s1="agthw";
        String s2="atgks";
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        HashMap<Character,Integer> hm3=new HashMap<>();
        HashMap<Character,Integer> hm4=new HashMap<>();
        int i=1;
        int n=s1.length();
        while(i<n)
        {
            hm1.put(s1.charAt(i-1),hm1.getOrDefault(s1.charAt(i-1),0)+1);
            hm2.put(s1.charAt(i),hm2.getOrDefault(s1.charAt(i),0)+1);
            hm3.put(s2.charAt(i-1),hm3.getOrDefault(s2.charAt(i-1),0)+1);
            hm4.put(s2.charAt(i),hm4.getOrDefault(s2.charAt(i),0)+1);
            i=i+2;
        }
        System.out.println(hm1);
        System.out.println(hm2);
        System.out.println(hm3);
        System.out.println(hm4);

        boolean check=true;

        for(Character key : hm1.keySet())
        {
            if(hm1.get(key)!=hm3.get(key))
            {
                check=false;
                break;
            }
        }
        if(check==true)
        {
            for(Character key : hm2.keySet())
            {
                if(hm2.get(key)!=hm4.get(key))
                {
                    check=false;
                    System.out.println("False");
                    break;
                }
            }
        }
        if(check==false) System.out.println("Not a Twin");
        else System.out.println("Twin");
    }
}
