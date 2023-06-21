import java.util.HashMap;

public class HC4 {
    public static void main(String[] args) {
        int arr[]={3,2,1,3,4,1,2,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();

        int max=0;

        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],i);
            }
            else
            {
                int temp=i-hm.get(arr[i]);
                max=Math.max(max, temp);
            }
            // if(!hm2.containsKey(arr[i]))
            // {
            //     hm2.put(arr[i],i);
            // }
            // else
            // {
            //     hm2.put(arr[i],i);
            // }
        }

        // System.out.println(hm);
        // System.out.println(hm2);

        // for(int i=0;i<arr.length;i++)
        // {
        //     int temp=hm2.get(arr[i])-hm.get(arr[i]);
        //     max=Math.max(temp,max);
        // }
        System.out.println(max);


    }
}
