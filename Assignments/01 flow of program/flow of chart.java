1) Input a year and find whether it is a leap year or not.
Ans : Any year that is evenly divisible by 4 is a leap year: for example, 1988, 1992, and 1996 are leap years

2)Take two numbers and print the sum of both.
ANS: import java.util.Scanner; 
  
class AddNumbers 
{ 
   public static void main(String args[]) 
   { 
      int x, y, z; 
      System.out.println("Enter two integers to calculate their sum "); 
      Scanner in = new Scanner(System.in); 
      x = in.nextInt(); 
      y = in.nextInt(); 
      z = x + y; 
      System.out.println("Sum of entered integers = "+z); 
   } 
} 

3) Take a number as input and print the multiplication table for it.
ANS import java.util.Scanner;
 
public class Exercise7 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input a number: ");
  int num1 = in.nextInt();
   
  for (int i=0; i< 10; i++){
   System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));
  }
 }
}


4) Take 2 numbers as inputs and find their HCF and LCM.
public class Hcf

{

public static void main(String args[]){

int hcf=0;

int n1 =12;

int n2 = 16;

for(int i = 1; i <= n1 || i <= n2; i++) {

if( n1%i == 0 && n2%i == 0 )

hcf = i;

}

System.out.println("HCF of given two numbers is "+hcf);

int lcm = (n1*n2)/hcf;

System.out.println("LCM of given two numbers is "+lcm);

}

}

There is a property in lcm and hcf

number 1 * number 2 = hcf * lcm by using this property we can find lcm.


5) Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.


import java.util.Scanner;

public class Lab4 {

 public static void main(String[] args) {

    int counter = 0;
    double even = 0;
    double odd = 0;
    double sum = 0;
    int input = 0;
    int large = 0;
    int small = 0;
    double average;

    System.out.print("Enter a series of values (0 to quit): ");
    Scanner in = new Scanner(System.in);

    while ((input = in.nextInt()) != 0) {

        small = in.nextInt();
        large = in.nextInt();

        if (input != 0)
            sum = input + sum;
            counter++;

        if (input > large)
            large = input;

        if (input < small)
            small = input;

        if (input % 2 == 0)
            even = even + 1;
        else
            odd = odd + 1;

        }

    if (counter > 0) {

        average = sum / counter;

        System.out.println("The smallest integer is: " + small);
        System.out.println("The largest integer is: " + large);
        System.out.println("Total number of integers entered is " + counter);
        System.out.println("Total even numbers entered is " + even);
        System.out.println("Total odd numbers entered is " + odd);
        System.out.println("The average value is: " + average);
    } else {

            System.out.println("No data was entered.");
        }

    }
}
