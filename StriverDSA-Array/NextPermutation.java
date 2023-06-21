import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int nums[]={5,8,7,2,8,3};
        int index=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }

        for(int i=nums.length-1;i>index;i--)
        {
                if(nums[i]>nums[index])
                {
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    break;
                }
        }
        // System.out.println(index);
        int start;
        if(index==-1) start=0;
        else start=index+1;
        int last=nums.length-1;
        while(start<last)
        {
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
        System.out.println(Arrays.toString(nums));

    }
}
