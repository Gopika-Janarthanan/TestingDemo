package Practice;

public class Factorial {
    //Find Factorial of a number
    static int fact(int n){
        if(n<1){
            return 1;
        }
        return n*fact(n-1);
    }
    static void factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        System.out.println(ans);
    }
}
