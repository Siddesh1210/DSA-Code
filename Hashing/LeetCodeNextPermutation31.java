import java.util.ArrayList;

public class LeetCodeNextPermutation31 {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        ArrayList<Integer> list=new ArrayList<>();
        String str="";
        for(int i=0;i<nums.length;i++)
        {
            str=str+Integer.toString(nums[i]);
        }
        System.out.println(str);
    }
}
