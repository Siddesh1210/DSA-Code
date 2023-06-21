import java.util.HashMap;

public class HC5 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]={5,3,5,7,4,2,4,8,5};
        int k=0;
        int pair=0;
        for(int i=0;i<arr.length;i++)
        {
            int temp=k-arr[i];
            if(!hm.containsKey(temp)) hm.put(arr[i],hm.get(arr[i])+1);
            else
            {
                int check=hm.get(arr[i]);
                k=k+check;
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
    }
}
