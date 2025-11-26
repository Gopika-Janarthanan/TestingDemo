package Practice;

public class Main {
    public static void main(String [] args){
        /*


Check whether a number is Armstrong

Print all Armstrong numbers in a given range

Find Factorial of a number

Check if a number is Palindrome

Reverse a number

Sum of digits of a number

Count digits in a number

Find GCD (HCF) of two numbers

Find LCM of two numbers

Check whether a number is Perfect

Calculate power of a number without using Math.pow()

String Programs

Reverse a string

Check if string is Palindrome

Count vowels and consonants in a string

Remove duplicate characters from a string

Find frequency of each character

Check if two strings are Anagrams

Reverse words in a sentence

Find first non-repeating character

Count total words in a string

Remove spaces from a string

Array Programs

Find the largest element in an array

Find the smallest element in an array

Sort an array in ascending order

Remove duplicate elements from an array

Find the second largest number in an array

Reverse an array

Merge two arrays

Find sum of all array elements

Search an element in an array

Move all zeros to the end of the array

Pattern Programs

Print star patterns (triangle, pyramid, inverted)

Print number patterns

Floyd’s Triangle

Hollow square pattern

Diamond pattern*/

        System.out.println("Prime Number");
        System.out.println(prime(5));
        System.out.println(prime(19));
        primenum(19);
        System.out.println();
        System.out.println("Fibonacci series");
        Fibonacci.fibo(10);
        System.out.println();
        System.out.println(Fibonacci.fibonacci(10));



}
        // Prime or not
        static boolean prime(int n){
              if(n<2){
                   return false;
                 }
                for(int i=2;i*i<n;i++){
                    if(n%i==0){
                      return false;
                    }
                 }
        return true;
        }
        //Print all Prime numbers between 1 and N
          static void primenum(int n){
             for(int i=0;i<=n;i++){
                   if(prime(i)){
                        System.out.print(i + " ");
                 }
             }
        }


}
