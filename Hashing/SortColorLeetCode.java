import java.util.Arrays;
import java.util.HashMap;

public class SortColorLeetCode {
    public static void main(String[] args) {
        int nums[]={0,2,1,1,0,2};
         HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        System.out.println(hm);
        int index=0;
        for(Integer ele : hm.keySet())
        {
            for(int i=1;i<=hm.get(ele);i++)
            {
                nums[index]=ele;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
