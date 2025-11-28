package Practice.Numbers;

public class Fibonacci {
    //Find 1 - Nth Fibonacci number
    static void fibo(int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;

        }
    }
    //Find Nth Fibonacci number
    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
