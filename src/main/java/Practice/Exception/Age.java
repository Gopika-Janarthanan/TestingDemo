package Practice.Exception;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        try{
            eligible();
        }
        catch (AgeIsNotValid age){
            System.out.println(age.getMessage());
        }
        finally {
            System.out.println("Successfully executed");
        }

    }
    static void eligible() throws AgeIsNotValid{
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num= input.nextInt();
        if(num>=18){
           System.out.println("Eligible");
       }
       else{
               throw new AgeIsNotValid("Not eligible");
       }


    }

}
