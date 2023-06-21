import java.util.HashMap;

public class CountArrayPair {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int k=5;
        int pair=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int res=gcd(nums[i],k);
            int x=k/res;
            for(Integer ele : hm.keySet())
            {
                if(ele%x==0) pair=pair+hm.getOrDefault(ele,0);
            }
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        System.out.println(pair);
        System.out.println(hm);
    }
    public static int gcd(int a , int b) {
        while(b!=0)
        {
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
}
