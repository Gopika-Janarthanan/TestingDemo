package Practice.Numbers;

public class SumofDigits {

    //Sum of digits of a number
    static int sum(int n){
        int ans=0;
        while(0<n){
            int d=n%10;
            ans+=d;
            n=n/10;
        }
        return ans;
    }
}
