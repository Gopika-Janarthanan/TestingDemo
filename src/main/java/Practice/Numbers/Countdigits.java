package Practice.Numbers;

public class Countdigits {

    //Count digits in a number

    static int count(int n){
        int ans=0;
        while(0<n){
            ans++;
            n=n/10;
        }
        return ans;
    }

    //Count digits in a number using log
    static int countofnum(int n){
        return (int)Math.log10(n)+1;
    }
}
