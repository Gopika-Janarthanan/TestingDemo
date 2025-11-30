package Practice.Exception;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        prime();

    }
    static boolean prime(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a num : ");
            int num = input.nextInt();
            for(int i=0;i<=num;i++){
                if(num<=1){
                    return false;
                }
                if(num%i==0){
                    return false;
                }
                return true;
            }

        }
        catch(Exception e){
            System.out.println("Wrong input");

        }
        finally {
            System.out.println("Prime number");
        }
    }
}
