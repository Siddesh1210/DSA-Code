import java.util.Arrays;
import java.util.HashMap;

public class PrefixSumGFG {
    public static void main(String[] args) {
        int arr[]={2,-3,-2,3,4,-4};
        int n=6;
        int prefix[]=new int[arr.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        prefix[0]=arr[0];
        int sum=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
            sum+=arr[i];
        }
        System.out.println(sum);
        if(sum==0)
        {
            System.out.println(Arrays.toString(arr)+" is Longest SubArray");
        }
        int maxLength=0;
        int tempDistance;
        int leftIndex=-1;
        int rightIndex=-1;
        // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(prefix));

        for(int i=0;i<prefix.length;i++)
        {
            int index=0;
            if(!hm.containsKey(prefix[i])) hm.put(prefix[i],i);
            else 
            {
                tempDistance=i-hm.getOrDefault(prefix[i],0);
                if(tempDistance>maxLength)
                {
                    maxLength=tempDistance;
                    leftIndex=hm.get(prefix[i])+1;
                    rightIndex=i;
                }
                int newArray[]=new int[maxLength];
                for(int j=leftIndex;j<=rightIndex;j++)
                {
                    newArray[index]=arr[j];
                    index++;
                }
                System.out.println(Arrays.toString(newArray));
            }
        }
        // System.out.println(hm);
        
    }
}
