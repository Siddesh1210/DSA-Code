public class MatrixZero {
    public static void main(String[] args) {
        int matrix[][]={{0,1,2,0},{3,4,5,2},{1,4,7,3}};
        int n=matrix.length;
        int m=matrix[0].length;
        // row--> matrix[...][0]
        //col --> matrix[0][...]
        int col0=1;
        //Marking col and Row
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0; //row mark
                    if(j!=0)
                    {
                        matrix[0][j]=0; //col mark and if present on 0,0 position
                    }                   //it will not mark here
                    else{
                        col0=0;
                    }
                }
            }
        }

        //Now iterating Matrix leaving 0 row 0 column
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]!=0)
                {
                    if(matrix[i][0]==0 || matrix[0][j]==0)
                    {
                        matrix[i][j]=0;
                    }
                }
            }
        }
        //Seeing first row taking reference as 0,0 index
        if(matrix[0][0]==0)
        {
            for(int j=0;j<m;j++)
            {
                matrix[0][j]=0;
            }
        }
        //seeing first column seeing reference as col0 variable
        if(col0==0)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
