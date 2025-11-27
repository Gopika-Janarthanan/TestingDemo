package Practice;

public class Armstrong {
    //Check whether a number is Armstrong
    static boolean armstrong(int n){
        if(isam(n) == n){
            return true;
        }
        return false;
    }

    //Print all Armstrong numbers in a given range
    static void arms(int n){
        for(int i=0;i<=n;i++){
            if(armstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static int isam(int n){
        int ans=0;

        while(0<n){
            int num=n%10;
            ans+=num*num*num;
            n=n/10;
        }
        return ans ;
    }
    }
