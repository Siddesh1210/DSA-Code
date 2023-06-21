import java.util.HashMap;

public class LeetCode523 {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,0,4,0,4,0};
        int k=5;
        HashMap<Integer,Integer>hm =new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum%k==0 && i!=0) System.out.println(true);
            System.out.print(sum+" ");
            if(!hm.containsKey(sum%k))
            {
                hm.put(sum%k,i);
            }
            else
            {
                int length=i-(hm.get(sum%k)+1);
                if(length>=2){
                System.out.println(true+" : "+i); 
                break;
                }
            }
            System.out.println(hm);
        }
    }
}
