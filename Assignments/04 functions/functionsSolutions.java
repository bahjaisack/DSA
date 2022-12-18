Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


public class Example {
   public static void main(String args[]) {
      int num1 = 15;
      int num2 = -5;
      int num3 = 7;
      if (num1 >= num2 && num1 >= num3)
         System.out.println( num1 + " is the maximum number.");
      else if (num2 >= num1 && num2 >= num3)
         System.out.println( num2 + " is the maximum number.");
      else
         System.out.println( num3 + " is the maximum number.");
   }
}



Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

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



A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.*;
class Voting
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Name: ");
      String name=sc.nextLine();
      System.out.println("Enter your age: ");
      int age=sc.nextInt();
      if((age>=18)&&(age<=100))
      {
          System.out.println("Congratulation "+name+", You are eligible for Voting");
      }
      else
      {
          System.out.println("Sorry "+name+", You are not eligible for voting");
      }      
  }





Write a program to print the sum of two numbers entered by user by defining your own method.
public class SumOfNumbers4.
{
public static void main(String args[])
{
int x = Integer.parseInt(args[0]); //first arguments.
int y = Integer.parseInt(args[1]); //second arguments.
int sum = x + y;
System.out.println("The sum of x and y is: " +sum);



Define a method that returns the product of two numbers entered by user.

int fNumber = input.nextInt(); System.out.print("Input the second number: "); int sNumber = input.nextInt(); int product = fNumber * sNumber; System.out.println("The product of the two numbers is: "+product);


Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

class JavaExample
{
  public static void main(String args[])
  {
    int radius = 3;
    //formula to calculate area of circle
    double area = Math.PI * (radius * radius);
    System.out.printf("Area is: %.2f", area);

    //formula to calculate circumference of circle
    double circumference= Math.PI * 2*radius;
    System.out.printf( "\nCircumference is: %.2f",circumference) ;
  }
}



Define a method to find out if a number is prime or not.


The isPrime(int n) method is used to check whether the parameter passed to it is a prime number or not. If the parameter passed is prime, then it returns True otherwise it returns False. If the number is less than 1, if(inputNumber<= 1) it returns false.

