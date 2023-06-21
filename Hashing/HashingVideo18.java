import java.util.HashMap;

public class HashingVideo18 {
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9,8,1,2,10,2,10,2,1};
        int sum=0;
        int k=15;
        int count=1;
        int maxLength=Integer.MIN_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                int prevLength=maxLength;
                maxLength=Math.max(maxLength,i+1);
                if(maxLength==prevLength) count++;
                else if(maxLength>prevLength) count=1;
                hm.put(sum,i);
                System.out.println(hm.getOrDefault(sum-k,0)+" "+i);
            }
            else if(!hm.containsKey(sum-k))
            {
                hm.put(sum,i);
            }
            else
            {
                System.out.println(hm.getOrDefault((sum-k),0)+1+" "+i);
                int length=i-hm.getOrDefault(sum-k,0);

                int prevLength=maxLength;
                maxLength=Math.max(maxLength,length);
                if(maxLength==prevLength) count++;
                else if(maxLength>prevLength) count=1;

                hm.put(sum,i);
            }
        }
        System.out.println(count);

    }
}
