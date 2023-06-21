public class TwoPointer {
    public static void main(String[] args) {
        int arr[]={5,8,11};
        int brr[]={2,15,15};
        int x=6;
        int n=arr.length;
        int m=brr.length;
        int first=1;
        int second=1;
        int max=0;
        int start=0;
        int end=m-1;
        while(start<n && end>=0)
        {
            int sum=arr[start]+brr[end];
            if(sum<=x)
            {
                if(sum>max)
                {
                    first=arr[start];
                    second=brr[end];
                    max=sum;
                }
                start++;
            }
            else
            {
                end--;
            }
        }
        System.out.println(max);
        System.out.println(first+" "+second);
        // list.add(first);
        // list.add(second);
    }
}
