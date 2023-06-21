import java.util.ArrayList;
import java.util.HashMap;

public class SumSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int n=arr.length;
        int s=12;
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>(); 
        int sum=0;
        int leftIndex=-1;
        int rightIndex=-1;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum-s==0)
            {
                leftIndex=0+1;
                rightIndex=i+1;
                list.add(leftIndex);
                list.add(rightIndex);
                // return list;
                System.out.println(list);
            }
            else if(hm.containsKey(sum-s))
            {
                leftIndex=hm.get(sum-s)+1;
                rightIndex=i+1;
                list.add(leftIndex);
                list.add(rightIndex);
                // return list;
                System.out.println(list);

            }
            else
            {
                hm.put(sum,i+1);
            }
        }
        // return list;
        System.out.println(list);

    }
}
