public class LongestSubArray
{
    public static void main(String[] args) {
        int nums[]={1, 2, 1, 0, 1, 1, 0};
        int k=4;
        int i=0; //Initailly
        int j=i+1; //Initially j will be at i+1
        int length=1; 
        int maxLength=1;
        int sum=nums[i]; //Initial sum will be starting element
        while(i<nums.length)  //i will go from 0 to n
        {            
            while(sum<=k && j<nums.length)  //checking condition
            {
                sum=sum+nums[j]; //increment sum
                if(sum<=k) //if sum is less increment j and length
                {
                    length++;
                    j++;
                }
            }
            maxLength=Math.max(maxLength,length);
            sum=sum-nums[j]-nums[i]; // as now we shift to next i position we subtract
            i++;                    //prev a[i] and current a[j] as due to which sum > k
            length-=1; //As a[i] is removed so length - 1
            if(j==nums.length) break;
        }
        System.out.println(maxLength);
    }
}