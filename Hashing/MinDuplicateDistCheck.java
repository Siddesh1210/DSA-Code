import java.util.HashMap;

public class MinDuplicateDistCheck {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]={1, 2, 3, 1, 1, 2, 3, 4};
        int k=3;
        boolean check=false;
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i])) hm.put(arr[i],i);
            else{
                if(i-hm.get(arr[i])<=k){
                    System.out.println("True");
                    check=true;
                    break;
                }
                else
                {
                    hm.put(arr[i],i);
                }
            }
        }
        if(check==false) System.out.println("Not present");
    }
}
