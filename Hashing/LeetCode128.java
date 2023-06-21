import java.util.HashMap;

public class LeetCode128 {
    public static void main(String[] args) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        HashMap<Integer,Boolean> checkedHashMap=new HashMap<>();

        int nums[]={0,3,7,2,5,8,4,6,0,1};
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i])) hm.put(nums[i],true);
        }

        int ls=0;
        for(int i=0;i<nums.length;i++)
        {
            int prevls=0;
            int start=0;
            boolean check=false;
            if(!hm.containsKey(nums[i]-1))
            {
                start=nums[i];
                check=true;
            }
            while(check==true  && !checkedHashMap.containsKey(start))
            {
                prevls++;
                checkedHashMap.put(start,true);
                if(hm.containsKey(start+1))
                {
                    start+=1;
                }
                else
                {
                    check=false;
                }
            }
            ls=Math.max(ls,prevls);
        }
        System.out.println(ls);
    }
}
