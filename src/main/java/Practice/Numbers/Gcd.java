package Practice.Numbers;

public class Gcd {

    //Find GCD (HCF) of two numbers
    static void gcd(int a,int b){
        int c=a%b;
        a=b;
        b=c;
        System.out.println(a+" " +b);
    }

    public static void main(String[] args) {
        gcd(4,12);
    }

}
