import java.util.Arrays;

public class Sortedarray
{
    public static void main(String[] args) {
        int nums[]={-4,-1,0,3,10}; 
        int ans[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int index=nums.length-1;
        while(i<=j)
        {
            if(Math.abs(nums[i])<=Math.abs(nums[j]))
            {
                ans[index]=nums[j]*nums[j];
                j--;
            }
            else
            {
                ans[index]=nums[i]*nums[i];
                i++;
            }
            index--;
        }
        System.out.println(Arrays.toString(ans));
    }
}