import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashinTutorial8 {
    public static void main(String[] args) {
        Map<Integer,Integer> hm=new HashMap<>();
        int arr[]={0, -1, 2, -3, -1};
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int index=0;
        int x=-2;
        boolean check=false;

        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(x-arr[i])) hm.put(arr[i],1);
            else
            {
                System.out.println("True : Pair is "+arr[i]+" and "+(x-arr[i]));
                list.get(index).add(arr[i]);
                list.get(index).add(x-arr[i]);
                index++;
                check=true;
                break;
            }
        }
        if(check==false) System.out.println("False");
        System.out.println(list);
    }
}
