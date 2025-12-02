package Practice.Exception;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        count();

    }
    static void count(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine().replace(" ","");
        int i=0,u=0,l=0,s=0,n=0;
        while(i<str.length()){
            if(Character.isUpperCase(str.charAt(i))){
                u++;
            }
            else if(Character.isLowerCase(str.charAt(i))){
                l++;
            }

            else if(Character.isDigit(str.charAt(i))){
                n++;
            }
            else{
                s++;
            }
            i++;
          }
        System.out.println("Lower case : "+l +"\nUpper Case : "+u+"\nNumbers : "+n+"\nSpecial char : "+s);

    }
}
