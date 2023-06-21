import java.util.ArrayList;

public class KapreKarHR {
    public static void main(String[] args) {
        int p=1;
        int q=99999;
        ArrayList<Long> list=new ArrayList<>();
        for(int i=p;i<=q;i++)
        {
            int sqr=(int)Math.pow(i,2);
            if(sqr<10)
            {
                if(sqr==i) list.add(Long.valueOf(i));
            }
            else
            {
                String s=Integer.toString(sqr);
                    String s1=s.substring(0,s.length()/2);
                    String s2=s.substring(s.length()/2,s.length());
                    Long sum=Long.valueOf(s1)+Long.valueOf(s2);
                    if(sum==i) list.add(sum);
            }
        }
        System.out.println(list+" ");
    }
}
