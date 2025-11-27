package Practice;

public class Palindrome {
    //Check if a number is Palindrome
    static boolean palindrome(int n){
        if(Reverse.reverse(n)==n){
            return true;
        }
        return false;
    }
}
