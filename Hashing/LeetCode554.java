import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode554 {
    public static void main(String[] args) {
        List<List<Integer>> wall=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();
        List<Integer> list4=new ArrayList<>();
        List<Integer> list5=new ArrayList<>();
        List<Integer> list6=new ArrayList<>();


        // [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
        list.add(2);
        // list.add(4);
        // list.add(3);
        // list.add(1);
        wall.add(list);

        // list2.add(1);
        // list2.add(1);
        // list2.add(3);
        // list2.add(4);
        // list2.add(1);
        // wall.add(list2);

        // list3.add(4);
        // list3.add(4);
        // list3.add(2);
        // wall.add(list3);

        // list4.add(2);
        // list4.add(5);
        // list4.add(3);
        // wall.add(list4);

        // list5.add(1);
        // list5.add(1);
        // list5.add(6);
        // list5.add(2);
        // wall.add(list5);

        // list6.add(1);
        // list6.add(3);
        // list6.add(1);
        // list6.add(1);
        // wall.add(list6);

        // System.out.println(wall);

        HashMap<Integer,Integer> hm=new HashMap<>();
        int countRow=wall.size();
        for(int i=0;i<wall.size();i++)
        {
            int sum=0;
            for(int j=0;j<wall.get(i).size()-1;j++)
            {
                sum+=wall.get(i).get(j);
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
        }
        // System.out.println(hm);
        int mainMax=countRow;
        for(Integer ele : hm.keySet())
        {
                mainMax=Math.min(mainMax,countRow-hm.get(ele));
        }
        
        System.out.println(mainMax+" is minimum destruction");
    }
}
