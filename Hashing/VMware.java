import java.util.Arrays;

public class VMware
{
    public static void main(String[] args) {
        String s="000111000";
        int zero[]=new int[s.length()];
        int one[]=new int[s.length()];
        int countZero=0;
        int countOne=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                countOne=0;
                countZero++;
                zero[i]=countZero;
            }
            else
            {
                countOne++;
                one[i]=countOne;
                countZero=0;
            }
        }
        System.out.println(Arrays.toString(zero));
        System.out.println(Arrays.toString(one));
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                int temp=i-zero[i];
                if(temp>=0) //checking index is valid or not
                {
                    if(zero[i]<=one[i-zero[i]]) count++;
                }
            }
            else
            {
                int temp=i-one[i];
                if(temp>=0) //checking index is valid or not
                {
                    if(one[i]<=zero[i-one[i]]) count++;
                }
            }
        }
        System.out.println(count);

    }
}

//Time Complexity is : O(n)
//space complexity is : o(n+m)