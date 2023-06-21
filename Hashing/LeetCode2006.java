import java.util.HashMap;

public class LeetCode2006 {
    public static void main(String[] args) {
        int nums[]={7,7,8,3,1,2,7,2,9,5};
        int k=6;
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i : nums)
        {
            res+=hm.getOrDefault(k+i,0)+hm.getOrDefault(i-k, 0);
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        System.out.println(res);

    }
}
