import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        // Vector<Vector<Integer>> vector=new Vector<>();
        // Vector<Integer> v1=new Vector<>();
        // Vector<Integer> v2=new Vector<>();

        // v1.add(1);
        // v1.add(2);
        // v1.add(3);
        // v1.add(4);

        // v2.add(1);
        // v2.add(2);
        // v2.add(3);
        // v2.add(4);
        // vector.add(v1);
        // vector.add(v2);

        // System.out.println(vector);
        int nums[]={-1,-2};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        Arrays.sort(nums);
        if(nums.length==1) max=1;
        else max=nums[nums.length-2]+1;
        System.out.println(max);
        for(int i=1;i<=max;i++)
        {
            if(!hm.containsKey(i)) System.out.println(i);
        }
        // return max+1;
        if(max<0) System.out.println(1);
        else System.out.println(max+1);


        
    }
}
