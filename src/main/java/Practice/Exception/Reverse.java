package Practice.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(rev());
    }

    static String rev(){
        Scanner input = new Scanner(System.in);
        String s="";
        try{
            System.out.print("Enter a string :");
            s=input.nextLine();
        }
        catch (InputMismatchException e){
            System.out.println("input mismatch"+e.getMessage());
        }
        int end=s.length()-1;
        String ans="";
        while(end>=0){
           ans=ans+s.charAt(end);
           end--;
        }

    return ans;

    }
}
