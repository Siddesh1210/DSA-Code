import java.util.TreeMap;

public class HashingCode1
{
    public static void main(String[] args) {
        int arr[]={3,2,1,4,5,3,6,4,6,3,2,6,8,2,9};
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        System.out.println(hm);
        
    }
}