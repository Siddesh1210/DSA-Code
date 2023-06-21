import java.util.HashMap;

public class HashingVideo17
{
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9,8,7};
        int sum=0;
        int k=15;
        int minLength=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k){
            minLength=Math.min(minLength,i+1);
            hm.put(sum,i);
            }
            else if(!hm.containsKey(sum-k))
            {
                hm.put(sum,i);
            }
            else
            {
                int length=i-hm.getOrDefault(sum-k,0);
                minLength=Math.min(minLength,length);
                hm.put(sum,i);
            }
        }
        System.out.println(minLength);
        
    }
}