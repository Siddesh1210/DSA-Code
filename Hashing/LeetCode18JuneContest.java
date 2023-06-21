import java.util.Arrays;

public class LeetCode18JuneContest {
    public static void main(String[] args) {
        // int mainTank=9;
        // int additionalTank=1;
        // int run=0;
        // while(mainTank>0 && additionalTank>0)
        // {
        //     mainTank-=5;
        //     run+=mainTank;
        //     mainTank+=1;
        //     additionalTank-=1;
        // }
        // System.out.println(run);
        int nums[]={1,3};
        Arrays.sort(nums);
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            int temp=Math.abs(prefix[i-1]-nums[i]);
            prefix[i]=nums[i];
            min=Math.min(min,temp);
        }
        System.out.println(min);

    }
}
