package Practice.Numbers;

public class Main {
    public static void main(String [] args){
/*
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

Find the second-largest number in an array

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

Diamond pattern */

        System.out.println("Prime Number");
        System.out.println(PrimeNumber.prime(5));
        System.out.println(PrimeNumber.prime(19));
        PrimeNumber.primenum(19);
        System.out.println();
        System.out.println("Fibonacci series");
        Fibonacci.fibo(10);
        System.out.println();
        System.out.println(Fibonacci.fibonacci(10));
        System.out.println("Armstrong Number");
        System.out.println(Armstrong.armstrong(153));
        System.out.println(Armstrong.armstrong(12));
        Armstrong.arms(3000);
        System.out.println();
        System.out.println("Factorial");
        System.out.println(Factorial.fact(4));
        Factorial.factorial(4);
        System.out.println();
        System.out.println("Reverse a number");
        System.out.println(Reverse.reverse(123));
        System.out.println(Reverse.rev(234567));
        System.out.println("Palindrone of a number");
        System.out.println(Palindrome.palindrome(1231));
        System.out.println("Sum of digits");
        System.out.println(SumofDigits.sum(1234));
        System.out.println("Count of digits");
        System.out.println(Countdigits.count(12345));
        System.out.println(Countdigits.countofnum(123456));


}


}
