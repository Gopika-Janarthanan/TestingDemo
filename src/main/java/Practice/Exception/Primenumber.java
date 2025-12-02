package Practice.Exception;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        System.out.println(prime());

    }
    static boolean prime(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num;
        try {
            num = input.nextInt();
        }
        catch(Exception e){
            System.out.println("Input mismatch");
            return false;
        }
        if (num <= 1) {
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }return true;
    }
}
