package Practice;

public class PrimeNumber {
    // Prime or not
    static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //Print all Prime numbers between 1 and N
    static void primenum(int n){
        for(int i=0;i<=n;i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
