import java.util.HashMap;

public class LeetCode974
{
    public static void main(String[] args) {
        // int nums[]={-1,2,9};
        // int k=2;
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // int sum=0;
        // int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     sum+=nums[i];
        //     if(sum%k==0) count++;
        //     if(!hm.containsKey(sum%k))
        //     {
        //         hm.put(sum%k,hm.getOrDefault(sum%k,0)+1);
        //     }
        //     else
        //     {
        //         count+=hm.getOrDefault(sum%k,0);
        //         hm.put(sum%k,hm.getOrDefault(sum%k,0)+1);
        //     }
        // }
        // System.out.println(count);
        // return count;
        String nums[]={"1","1","1"};
        String target="11";
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                String str=nums[i];
                if(i!=j)
                {
                    str+=nums[j];
                    if(str.equals(target)) count++;
                }
            }
        }
        System.out.println(count);
    }
}