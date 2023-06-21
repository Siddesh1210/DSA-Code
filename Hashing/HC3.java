public class HC3 {
    public static void main(String[] args) {
        int nums[]={3,4,6,2,3,6,7,5,4,2,6,7};
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        int subArray=prefix[5]-prefix[2-1];
        System.out.println(subArray);
    }
}
