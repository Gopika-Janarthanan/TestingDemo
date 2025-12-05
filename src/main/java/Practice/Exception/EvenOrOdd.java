package Practice.Exception;
import org.openqa.selenium.json.JsonOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        evenOrOdd();
    }

    static void evenOrOdd(){
        Scanner input = new Scanner(System.in);
        int n;
        try{
            System.out.print("Enter a number : ");
            n =input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("try different input "+e.getMessage());
            return;
        }
        if(n%2==0){
            System.out.println("Even");;
        }
        else{
            System.out.println("odd");
        }
    }

}
