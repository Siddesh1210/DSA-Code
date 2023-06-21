import java.util.HashMap;

public class PairGFG {
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        int k=2;
        int pair=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(k-arr[i]))
            {
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
            else
            {
                pair+=hm.getOrDefault(k-arr[i],0);
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
        }
        System.out.println(pair);
        System.out.println(hm);
        // return pair;
    }
}
