import java.util.*;

public class CountNoOfpair {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]={1,5,7,1};
        int k=6;
        int pair=0;

        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(k-arr[i])) hm.put(arr[i],1);
            else 
            {
                pair=pair+hm.get(k-arr[i]);
                System.out.println(arr[i]+" "+(k-arr[i]));
                
                // hm.put(arr[i],hm.get(arr[i])+1);
                hm.put(arr[i], hm.getOrDefault(arr[i],0) +1);
            }
        }
        System.out.println(pair);
    }
}
