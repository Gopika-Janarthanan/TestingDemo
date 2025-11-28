package Practice;

public class Countdigits {

    static int count(int n){
        int ans=0;
        while(0<n){
            ans++;
            n=n/10;
        }
        return ans;
    }
    static int countofnum(int n){
        return (int)Math.log10(n)+1;
    }
}
