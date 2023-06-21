public class BinnaryToDecimal {
    public static void main(String[] args) {
        int bin=1000;
        int power=0;
        int decimal=0;
        while(bin!=0)
        {
            int rem=bin%10;
            decimal=decimal+rem*(int)Math.pow(2,power);
            power++;
            bin=bin/10;
        }
        System.out.println(decimal);
    }
}
