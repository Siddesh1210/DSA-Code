import java.util.HashMap;

public class XorSumArray
{
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int k=5;
        int xor=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            xor^=arr[i];
            if(xor==k) count++;
            if(!hm.containsKey(xor^k))
            {
                hm.put(xor,hm.getOrDefault(xor, 0)+1);
            }

            else{
                count+=hm.get(xor^k);
                hm.put(xor,hm.getOrDefault(xor, 0)+1);
                System.out.println(hm);
            }
        }
        System.out.println(count);
    }
}