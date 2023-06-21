import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeContest2657 {
    public static void main(String[] args) {
        int A[]={2,3,1};
        int B[]={3,1,2};
        Set<Integer> set=new HashSet<>();
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            if(set.contains(A[i])) count++;
            set.add(A[i]);
            if(set.contains(B[i])) count++;
            set.add(B[i]);
            list.add(count);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }

}
