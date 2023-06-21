public class DecimalTOBinary {
    public static void main(String[] args) {
        int dec=8;
        int bin=0;
        int power=0;
        while(dec!=0)
        {
            int rem=dec%2;
            bin=bin+rem*(int)Math.pow(10,power);
            power++;
            dec/=2;
        }
        System.out.println(bin);
    }
}
