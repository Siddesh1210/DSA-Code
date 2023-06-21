import java.util.HashMap;

public class LongestPplaindromeLength {
    public static void main(String[] args) {
        // String words[]={"ab","ty","yt","lc","cl","ab"};
        String words[]={"dd","aa","bb","dd","aa","dd","bb","dd","aa","cc","bb","cc","dd","cc"};
        HashMap<String,Integer> hm=new HashMap<>();
        boolean flag=true;
        int total=0;
        for(int i=0;i<words.length;i++)
        {
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
        System.out.println(hm);
        for(int i=0;i<words.length;i++)
        {
            if(words[i].charAt(0)!=words[i].charAt(1))
            {
                String rev="";
                rev+=words[i].charAt(1);
                rev+=words[i].charAt(0);
                if(hm.containsKey(rev))
                {
                    int min=Math.min(hm.get(rev),hm.get(words[i]));
                    total+=(4*min);
                    hm.remove(rev);

                }
                hm.remove(words[i]);
            }
            else
            {
                if(hm.getOrDefault(words[i],0)%2==0) //Even repeated string character in array
                {
                    total+=(2*hm.getOrDefault(words[i],0));
                }
                else  //odd repeated string character in array
                {
                    if(flag==true)
                    {
                        total+=(2*hm.getOrDefault(words[i],0));
                        flag=false;
                    }
                    else
                    {
                        total+=2*(hm.getOrDefault(words[i],0)-1);
                    }
                }
                hm.remove(words[i]);
            }
        }
        System.out.println(hm);
        System.out.println("The length is : "+total);
        
    }
}
