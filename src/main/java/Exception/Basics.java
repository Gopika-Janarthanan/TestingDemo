package Exception;

public class Basics {
    public static void main(String [] args){
    twonum(12,0);
    }
    static void twonum(int a , int b){
        try{
            int c = a/b;

        }
        catch (Exception e ){
            System.out.println(e);
        }
    }
}
