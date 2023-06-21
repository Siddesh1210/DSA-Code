public class PrefixSum2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int psm[][]=new int[arr.length+1][arr[0].length+1];
        for(int i=1;i<psm.length;i++)
        {
            for(int j=1;j<psm[0].length;j++)
            {
                psm[i][j]=psm[i][j-1]+psm[i-1][j]-psm[i-1][j-1]+arr[i-1][j-1];
            }
        }
        
        for(int i=0;i<psm.length;i++)
        {
            for(int j=0;j<psm[0].length;j++)
            {
                System.out.print(psm[i][j]+" ");
            }
            System.out.println();
        }
    }
}
