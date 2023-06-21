import java.util.HashMap;

public class MinOperationEqual
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,1,1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        // System.out.println(hm);
        int frequency=1;
        for (Integer ele : hm.keySet()) {
            frequency=Math.max(frequency,hm.get(ele));
        }
        System.out.println(frequency+" - highest frequency");
        int operation=arr.length-frequency;
        System.out.println(operation+" is no of operation required");
    }
}