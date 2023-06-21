import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class LeetCode2661 {
    public static void main(String[] args) {
        int arr[]={2,8,7,4,1,3,5,6,9};
        int mat[][]={{3,2,5},{1,4,6},{8,7,9}};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++) hm.put(arr[i],i);
        System.out.println(hm);

        // for(int i=0;i<mat.length;i++)
        // {
        //     for(int j=0;j<mat[0].length;j++)
        //     {
        //         mat[i][j]=hm.get(mat[i][j]);
        //     }
        // }

        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<mat.length;i++)
        // {
        //     int max=0;
        //     int max2=0;
        //     for(int j=0;j<mat[0].length;j++)
        //     {
        //         max=Math.max(max,mat[i][j]);
        //         max2=Math.max(max2,mat[j][i]);
        //     }
        //     list.add(max);
        //     list.add(max2);
        // }
        
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list.get(0));
        int minIndex=Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++)
        {
            int max=0;
            for(int j=0;j<mat[0].length;j++)
            {
                max=Math.max(max,hm.get(mat[i][j]));
            }
            minIndex=Math.min(max,minIndex);
        }
        for(int i=0;i<mat[0].length;i++)
        {
            int max=0;
            for(int j=0;j<mat.length;j++)
            {
                max=Math.max(max,hm.get(mat[j][i]));
            }
            minIndex=Math.min(max,minIndex);
        }
        System.out.println(minIndex);
    }
}
