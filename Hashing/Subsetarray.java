import java.util.HashSet;

public class Subsetarray {
    public static void main(String[] args) {
        int arr[]={2,5,4,3,7,5,7};
        int subArray[]={4,2,5,1};
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.add(arr[i]);
        }

        boolean check=true;
        for(int i=0;i<subArray.length;i++)
        {
            if(!hm.contains(subArray[i]))
            {
                check=false;
                break;
            }
        }
        if(check==false) System.out.println("No SubArray");
        else System.out.println("Subarray");
    }
}
