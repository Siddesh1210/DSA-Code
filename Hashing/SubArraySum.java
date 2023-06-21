import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int Arr[]={2,4,-3,2,5,-1,2};
        int N=7;
        int K=3;
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            sum=sum+Arr[i];
            // System.out.println(sum);
            if(sum==K) count++;
            if(hm.containsKey(sum-K))
            {
                count=count+hm.getOrDefault(sum-K,0);
                hm.put(sum,hm.getOrDefault(sum, 0)+1);
            }
            else
            {
                hm.put(sum,hm.getOrDefault(sum, 0)+1);
            }
        }
        System.out.println(hm);
        System.out.println(count);

    }
}
