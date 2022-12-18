1) Write a program to print whether a number is even or odd, also take input from the user.
ANS : import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}


2) Take name as input and print a greeting message for that particular name.

ANS : import java.util.Scanner;
class Greeting
{
	public static void main(String arg[])	
	{
	    char c='"';
            Scanner sc=new Scanner(System.in);	
	    System.out.println("Enter the string");
	    String name = sc.nextLine(); 
	    System.out.println("Greetings("+c+name+c+") --> "+c+"Hello "+name+"!"+c);
	}
}

3) Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

ANS: public class Main  
 {  
   public static void main (String args[])  
    {   float p, r,  t,  si; // principal amount, rate, time and simple interest respectively  
              p = 13000;  r = 12; t = 2;  
               si  = (p*r*t)/100;   
              System.out.println("Simple Interest is: " +si);  
    }}  
    
4) Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
ANS : import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// taking input from the user using the Scanner
		// class
		System.out.print(
			"Enter the first and the Second number - ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		// selecting the operand for the calculations
		System.out.print(
			"Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
		char op = sc.next().charAt(0);
		solve(a, b, op);
	}
	public static int solve(int a, int b, char op)
	{
		int ans = 0;
		// addition
		if (op == '+') {
			ans = a + b;
			// subtraction
		}
		else if (op == '-') {
			ans = a - b;
			// multiplication
		}
		else if (op == '*') {
			ans = a * b;
			// modulo
		}
		else if (op == '%') {
			ans = a % b;
			// division
		}
		else if (op == '/') {
			ans = a / b;
		}

		// printing the final result
		System.out.println("Your answer is - " + ans);
		return ans;
	}
}


5) Take 2 numbers as input and print the largest number.

ANS : import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int numberOne, numberTwo, largest;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      numberOne = scan.nextInt();
      System.out.print("Enter the Second Number: ");
      numberTwo = scan.nextInt();
      
      if(numberOne>numberTwo)
         largest = numberOne;
      else
         largest = numberTwo;
      
      System.out.println("\nLargest = " +largest);
   }
}

6) Input currency in rupees and output in USD.
A: import java.util.Scanner;

public class MathUnitConversions17 {

	public static void main(String[] args) {

		float rupees;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter rupees:");

		rupees = in.nextLong();

		float dollars = rupees / 64;

		System.out.println(dollars + " Dollars");
	}
}

7) To calculate Fibonacci Series up to n numbers.
ANS: import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int sum = 0, n;
int a = 0;
int b = 1;
System.out.println("Enter the nth value: ");
n = sc.nextInt();
System.out.println("Fibonacci series: ");
while(sum <= n)
{
System.out.print(sum + " ");
a = b;  // swap elements
b = sum;
sum = a + b;  // next term is the sum of the last two terms 
}
}
}


8) To find out whether the given String is Palindrome or not.
ANS: public class Palindrome  
{  
    public static void main(String[] args) {  
        String string = "Kayak";  
        boolean flag = true;  
          
        //Converts the given string into lowercase  
        string = string.toLowerCase();  
          
        //Iterate the string forward and backward, compare one character at a time   
        //till middle of the string is reached  
        for(int i = 0; i < string.length()/2; i++){  
            if(string.charAt(i) != string.charAt(string.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }  
        if(flag)  
            System.out.println("Given string is palindrome");  
        else  
            System.out.println("Given string is not a palindrome");  
    }  
}  

9) To find Armstrong Number between two given number.

// JAVA program to find Armstrong
// numbers in a range
import java.io.*;
import java.math.*;

class GFG {
	
	// Prints Armstrong Numbers in given range
	static void findArmstrong(int low, int high)
	{
		for (int i = low + 1; i < high; ++i) {
	
			// number of digits calculation
			int x = i;
			int n = 0;
			while (x != 0) {
				x /= 10;
				++n;
			}
	
			// compute sum of nth power of
			// its digits
			int pow_sum = 0;
			x = i;
			while (x != 0) {
				int digit = x % 10;
				pow_sum += Math.pow(digit, n);
				x /= 10;
			}
	
			// checks if number i is equal
			// to the sum of nth power of
			// its digits
			if (pow_sum == i)
				System.out.print(i + " ");	
		}
	}
	
	// Driver code
	public static void main(String args[])
	{
		int num1 = 100;
		int num2 = 400;
		findArmstrong(num1, num2);
		System.out.println();
	}
}
