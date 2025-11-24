package Exception;

public class Practice {
    public static void main(String[] args) {
        prime(5);
    }
    static void prime(int n){
        for(int i=2;i<=n;i++){
            if(n%i==0 && i%1==i){
                System.out.println(i+"->"+"prime");
            }
            else{
                System.out.println(i+"->"+"not prime");
            }
        }
    }
}
