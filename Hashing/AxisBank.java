import java.util.HashMap;
import java.util.Scanner;

public class AxisBank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the words: "); //Taking Input from User
        String s=sc.nextLine();
        // String s="Bat Cat matter Cat Bat";
        HashMap<String,Integer> hm=new HashMap<>();
        s=s+" ";
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                String temp=s.substring(index,i);
                hm.put(temp,hm.getOrDefault(temp,0)+1);
                index=i+1;
            }
        }
        System.out.println(hm);
        for(String key : hm.keySet())
        {
            if(hm.get(key)>1)
            {
                System.out.print(key+" ");
            }
        }
    }
}
