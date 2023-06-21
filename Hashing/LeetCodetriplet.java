import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodetriplet {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int nums[]={-1,0,1,2,-1,-4,-2,-3,3,0,4};
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue; //checking curr i and prev i
            int j=i+1;                              //are same or not
            int k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0) j++;
                else if(sum>0) k--;
                else
                {
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]); list.add(nums[j]); list.add(nums[k]);
                    ans.add(list); //adding all three above list in ans list
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++; //incre j & k untill there 
                    while(j<k && nums[k]==nums[k+1]) k--; //further ele is not same
                }
            }
        }
        System.out.println(ans);
        System.out.println(ans.size());
    }
}
