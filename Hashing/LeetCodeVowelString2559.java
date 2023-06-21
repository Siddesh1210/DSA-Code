import java.util.Arrays;

public class LeetCodeVowelString2559
{
    public static void main(String[] args) {
        int index=0;
        String words[]={"a","e","i"};
        for(String ele:words)
        {
            char ch1=ele.charAt(0);
            char ch2=ele.charAt(ele.length()-1);
            if((ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') && (ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u'))
            {
                words[index]="V";
            }
            else words[index]="N";
            index++;
        }

        int prefix[]=new int[words.length];
        if(words[0]=="V") prefix[0]=1;
        else prefix[0]=0;
        for(int i=1;i<words.length;i++)
        {
            if(words[i]=="V") 
            {
                prefix[i]=prefix[i-1]+1;
            }
            else prefix[i]=prefix[i-1];
        }
        // System.out.println(Arrays.toString(words));
        // System.out.println(Arrays.toString(prefix));
        int queries[][]={{0,2},{0,1},{2,2}};
        int ans[]=new int[queries.length];
        index=0;
        for (int[] arr : queries) {
            int temp1=arr[0];
            int temp2=arr[1];
            if(temp1==0) ans[index]=(prefix[temp2]);
            else ans[index]=(prefix[temp2]-prefix[temp1-1]);
            index++;
        }
        // System.out.println(Arrays.toString(ans));
    }
}