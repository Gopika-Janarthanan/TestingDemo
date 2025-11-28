package Practice.Numbers;
import java.lang.StringBuilder;
public class Reverse {
    //Reverse a number
    static int reverse(int n){
        int ans=0;
        while(0<n) {
            int d = n%10;
            ans=ans*10+d;
            n=n/10;
        }
        return ans;
    }

    static int rev(int n){
        StringBuilder ans = new StringBuilder(String.valueOf(n));
        return Integer.parseInt(ans.reverse().toString());
    }


}
