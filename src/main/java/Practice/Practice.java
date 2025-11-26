package Practice;

public class Practice {
    public static void main(String[] args) {
        //Number Programs
        System.out.println("Armstrong :"+armstrong(153));
        System.out.println("Armstrong :"+armstrong(12));

    }
    static boolean armstrong(int n){
        if(isam(n) == n){
            return true;
        }
        return false;
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
