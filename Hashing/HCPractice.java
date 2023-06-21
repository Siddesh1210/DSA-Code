import java.util.HashMap;

public class HCPractice {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,1,3,4,2,1,2,3,4,2,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            // if(!hm.containsKey(arr[i]))
            // {
            //     hm.put(arr[i],1);
            // }
            // else
            // {
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            // }
        }
        System.out.println(hm);
    }
}
