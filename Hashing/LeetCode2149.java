import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LeetCode2149 {
    public static void main(String[] args) {
        int nums[]={3,1,-2,-5,2,-4};
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0) 
            {
               list1.add(nums[i]);
            }
            else
            {
                list2.add(nums[i]);
            }
        }
        // System.out.println(list1);
        // System.out.println(list2);
        int index=0;
        for(int i=0;i<list1.size();i++)
        {
            nums[index]=list1.get(i);
            index++;
            nums[index]=list2.get(i);
            index++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
