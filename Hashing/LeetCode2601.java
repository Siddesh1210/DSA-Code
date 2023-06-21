import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class LeetCode2601 {
    public static void main(String[] args) {
        int nums[]={1,3,4,2};
        List<List<Integer>> parent=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            max=Math.max(max,hm.getOrDefault(nums[i],0));
        }
        // System.out.println(max);
        int j=1;
        while(j<=max)
        {
            ArrayList<Integer> list=new ArrayList<>();
            Set<Integer> key=hm.keySet();
            for(Integer ele: key)
            {
                if(hm.get(ele)>0) list.add(ele);
                hm.put(ele,hm.getOrDefault(ele,0)-1);
            }
            // System.out.println(list);
            parent.add(list);
            j++;
        }
        System.out.println(parent);
    }
}
