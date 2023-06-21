import java.util.HashSet;

public class LeetCode2461
{
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        int nums[]={4,4,4,4,4};
        int k=1;
        int ans=0;
        long max=0;
        for(int i=0;i<=nums.length-k;i++)
        {
            hs.clear();
            ans=0;
            int count=0;
            while(count<k)
            {
                    if(!hs.contains(nums[i+count]))
                    {
                        ans+=nums[i+count];
                        hs.add(nums[i+count]);
                    }
                    else{ ans=0;break; }
                    count++;
            }
            max=Math.max(max,ans);
        }
        System.out.println(max);
    }
}