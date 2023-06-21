import java.util.TreeMap;

public class HC2 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        int nums[]={3,4,6,5,8,2,1};
        int target=6;
        for(int i=0;i<nums.length;i++)
        {
            tm.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(tm.containsKey(target-nums[i]) && nums[i]!=target-nums[i])
            {
                int index=tm.get(target-nums[i]);
                System.out.println(i+" : "+index);
                break;
            }
        }
    }
}
