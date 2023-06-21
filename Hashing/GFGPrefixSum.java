// import java.util.Arrays;
import java.util.HashMap;

public class GFGPrefixSum {
    public static void main(String[] args) {
        // int A[] = {-13,0,6,15,16,2,15,-12,17,-16,0,-3,19,-3,2,-9,-6};
        int A[]={10,5,2,7,1,9};
        int k=15;
        int prefix[]=new int[A.length];
        HashMap <Integer,Integer> hm=new HashMap<>();
        int length=0;
        int maxLength=0;
        prefix[0]=A[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+A[i];
        }
        // System.out.println(Arrays.toString(prefix));
        for(int i=0;i<A.length;i++)
        {
            if(prefix[i]==k)
            {
                if(!hm.containsKey(prefix[i])) hm.put(prefix[i],i);
                // System.out.println("hii");
                maxLength=i+1;
            }
            if(!hm.containsKey(prefix[i]-k))
            {
                if(!hm.containsKey(prefix[i])) hm.put(prefix[i],i);
            }
            else
            {
                length=i-((hm.getOrDefault(prefix[i]-k,0)+1))+1;
                if(!hm.containsKey(prefix[i])) hm.put(prefix[i],i);
                // System.out.println((hm.getOrDefault(prefix[i]-k,0)+1)+" to "+i);
            }
            maxLength=Math.max(maxLength,length);
            // System.out.println(maxLength);
        }
        System.out.println(maxLength+" ");
        // System.out.println(hm);

    }
}
