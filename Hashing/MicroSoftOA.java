import java.util.*;
public class MicroSoftOA {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]={12,33,6,51,85,42};
        int maxTotal=0;;
        int tempTotal=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            int temp=arr[i];
            while(temp!=0)
            {
                sum+=temp%10;
                temp/=10;
            }
            if(!hm.containsKey(sum))
            {
                hm.put(sum,arr[i]);
            }
            else
            {
                tempTotal=arr[i]+hm.getOrDefault(sum, 0);
                maxTotal=Math.max(maxTotal,tempTotal);
                if(arr[i]>hm.getOrDefault(sum,0))
                {
                    hm.put(sum,arr[i]);
                }
            }
        }
        System.out.println(maxTotal+" ");
        System.out.println(hm);

    }
}
