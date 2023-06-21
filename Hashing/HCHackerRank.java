import java.util.ArrayList;
import java.util.HashMap;

public class HCHackerRank {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        // 1 2 3 1 2 3 3 3
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);

        for(int i=0;i<arr.size();i++)
        {
            hm.put(arr.get(i),hm.getOrDefault(arr.get(i),0)+1);
        }
        System.out.println(hm);
        int max=1;
        for(Integer ele : hm.keySet())
        {
            max=Math.max(hm.get(ele),max);
        }
        int change=arr.size()-max;
        System.out.println(change);
        
    }
}
