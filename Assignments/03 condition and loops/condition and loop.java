
1. Area Of Circle Java Program
 public class Circle.
{
public static void main(String[] args)
{
int r;
double pi = 3.14, area;
Scanner s = new Scanner(System. in);
System. out. print("Enter radius of circle:");

3. Area Of Triangle
public class test.
{
public static void main (String args[])
{ float b=4,h =13,area ;
area = ( b*h) / 2 ;
System.out.println("Area of Triangle is: "+area);
}}


5. Area Of Rectangle Program 
public class rectangle{
public static void main(String args[])
{
int width=5;
int height=10;
int area=width*height;
System.out.println("Area of rectangle="+area);
}


7. Area Of Isosceles Triangle 

import java.util.Scanner;
class AreaOfIsoscelesTriangle 
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the length of same sided");
         
         double a= s.nextDouble();
         
         System.out.println("Enter the side2 of the Triangle");
         
         double b= s.nextDouble();
 
         double  area=(b/4)*Math.sqrt((4*a*a)-(b*b));
      
         System.out.println("Area of Isosceles Triangle is: " + area);
   }
}


9. Area Of Parallelogram
include <stdio.h>  
int main()  
{  
  int base=4;  
  int height=18;  
  int area_parallelogram=base*height;  
  printf("Area of the parallelogram=%d",area_parallelogram);  
  return 0;  
}  


11. Area Of Rhombus
rea_of_rhombus= ( d1 * d2 ) / 2; // It is a formula for calculating a area of rhombus.

13. Area Of Equilateral Triangle
public class tops.
{
public static void main (String args[])
{ float a = 5f ;
double area = ( 1.73 * a*a) / 4 ;
System.out.println("Area of Equilateral Triangle is:"+area);
}}

15. Perimeter Of Circle

import java.util.Scanner;
public class Perimeter.
{
int r, l, b, s1, s2, s3;
double pi = 3.14,perimeter;
Scanner s = new Scanner(System. in);
void circle()
{


18. Perimeter Of Equilateral Triangle
    Using Scanner Class
import java.util.Scanner;
class PerimeterOfEquilateralTriangle 
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the Triangle:");
         
	 double a= s.nextDouble();
 
         double  perimeter=3*a;
      
         System.out.println("perimeter of Triangle is: " + perimeter);      
   }
}

20. Perimeter Of Parallelogram
import java.util.Scanner;
class PerimeterOfParallelogram
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the height of the Parallelogram:");
         
         double h= s.nextDouble();
	 
	 System.out.println("Enter the breadth of the Parallelogram:");
         
	 double b= s.nextDouble();
          
         double  perimeter=2*(h+b);
     
	 System.out.println("perimeter of Parallelogram is: " + perimeter);      
   }
}


22. Perimeter Of Rectangle
 a=c=2 # in rectangle sides opposite to each other are equal in length  
b=d=4 # length of opposite sides  
Perimeter = 2*(a+ b)  
print("Perimeter of rectangle is: ");  
print(Perimeter); 


24. Perimeter Of Square
ing Scanner ClassJava
import java.util.Scanner;
class PerimeterOfSquare
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the square:");
         
	 double a= s.nextDouble();
	 
         double  perimeter=4*a;
     
	 System.out.println("perimeter of Square is: " + perimeter);      
   }
}



26. Perimeter Of Rhombus


import java.util.Scanner;
class PerimeterOfRhombus
{
   public static void main(String args[]) 
    {   
       
      	 Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the Rhombus:");
         
         double a= s.nextDouble();
	 
         double  perimeter=4*a;
      
	 System.out.println("perimeter of Rhombus is: " + perimeter);      
   }
}


28. Volume Of Cone Java Program
public class cone{
public static void main(String args[])
{
int height=38;
int radius=35;
double pie=3.14285714286;
double volume=pie*(radius*radius)*height/3;
System.out.println("Volume of the cone="+volume);


30. Volume Of Prism
import java.util.Scanner;
class VolumeOfPrism 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the area of base:");
         double base=s.nextDouble();
         System.out.println("Enter the height:");
         double height=s.nextDouble();
         
 
          
          double  area=base*height ;
      System.out.println("Volume Of Prism is: " + area);      
   }
}


32. Volume Of Cylinder
public class cylinder{
public static void main(String args[])
{
int height=38;
int radius=35;
double pie=3.14285714286;
double volume=pie*(radius*radius)*height;
System.out.println("Volume of the cylinder="+volume);

34. Volume Of Sphere
public class sphere{  
        public static void main(String args[])  
    {  
    int radius=48;  
    double pie=3.14285714286;  
    double volume=(4.0/3.0)pie(radius*radius*radius);  
    System.out.println("Volume of the sphere="+volume);  
     }  
}  

36. Volume Of Pyramid

// Java Program for volume
// of Pyramid.
import java.util.*;
import java.lang.*;

class GfG
{
	
	// Function to find the volume of
	// triangular pyramid
	public static float volumeTriangular(int a,
										int b,
										int h)
	{
		float vol = (float)(0.1666) * a * b * h;
		return vol;
	}

	// Function to find the volume
	// of square pyramid
	public static float volumeSquare(int b,
									int h)
	{
		float vol = (float)(0.33) * b * b * h;
		return vol;
	}

	// Function to find the volume of
	// pentagonal pyramid
	public static float volumePentagonal(int a,
										int b,
										int h)
	{
		float vol = (float)(0.83) * a * b * h;
		return vol;
	}

	// Function to find the volume of hexagonal
	// pyramid
	public static float volumeHexagonal(int a,
										int b,
										int h)
	{
		float vol = (float)a * b * h;
		return vol;
	}
	
	// Driver Code
	public static void main(String argc[])
	{
		int b = 4, h = 9, a = 4;
		System.out.println("Volume of triangular"+
							" base pyramid is " +
					volumeTriangular(a, b, h));

		System.out.println("Volume of square base" +
									" pyramid is " +
								volumeSquare(b, h));

		System.out.println("Volume of pentagonal"+
							" base pyramid is " +
					volumePentagonal(a, b, h));

		System.out.println("Volume of Hexagonal"+
							" base pyramid is " +
						volumeHexagonal(a, b, h));
	}
}

// This code is contributed by Sagar Shukla



38. Curved Surface Area Of Cylinder
public class test.
{
public static void main(String args[])
{
float r, h, surfacearea;
r = 2;
h = 5;
surfacearea = (22*r*(r+h))/7;


40. Total Surface Area Of Cube

public class test1   
{    
public static void main (String args[])   
 {   float a, l, b, h, surfacearea;       
     l = 5;  
     b =5;  
     h = 5;    
     a=l=b=h;    
    surfacearea  = 6*(a*a);       
     System.out.println ("Surface Area of Cube is ");  
     System.out.println(surfacearea);  
}}  


42. Fibonacci Series In Java Programs
class FibonacciExample2{
static int n1=0,n2=1,n3=0;
static void printFibonacci(int count){
if(count>0){
n3 = n1 + n2;
n1 = n2;
n2 = n3;
System.out.print(" "+n3);

44. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15



46. Input a number and print all the factors of that number (use loops).

public class Main {

  public static void main(String[] args) {

    // positive number
    int number = 60;

    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to 60
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}


48. Take integer inputs till the user enters 0 and print the sum of all numbers
(HINT: while loop)
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


25. Take integer inputs till the user enters 0 and print the largest number from
all.
import java.util.Scanner;
 
public class JavaLoopExcercise
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
 
        int number;
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;  
 
        char choice;
 
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
 
            if(number > max)
            {
                max = number;
            }
 
            if(number < min)
            {
                min = number;
            }
 
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
 
        }while(choice=='y' || choice == 'Y');
 
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }  
}



26. Addition Of Two Numbers
public class SumOfNumbers4.
{
public static void main(String args[])
{
int x = Integer.parseInt(args[0]); //first arguments.
int y = Integer.parseInt(args[1]); //second arguments.
int sum = x + y;
System.out.println("The sum of x and y is: " +sum);



### Intermediate Java Programs
1. Factorial Program In Java
class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  


3. Calculate Electricity Bill
{ public static void main(String args[]) {
long units; Scanner sc=new Scanner(System. in);
System. out. println("enter number of units"); ...
double billpay=0; if(units<100)
billpay=units*1.20; else if(units<300)
else if(units>300) billpay=100*1.20+200 *2+(units-300)*3;
System. out. println("Bill to pay : " + billpay);





5. Calculate Average Of N Numbers
import java.util.Scanner;

public class CalculateAverage 
{
	public static void main(String[] args) 
	{
		System.out.println("How many numbers do you want to enter?");
		Scanner scanner = new Scanner(System.in);
		//this is number of input values user will provide in console
		int count = scanner.nextInt();	
		
		double[] array = new double[count];
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter input number " + (i + 1) + ": ");
			array[i] = scanner.nextDouble();
		}
		scanner.close();
		
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		//Get the average here
		double average = sum / count;

		System.out.format("The average is: %.2f", average);
	}
}



7. Calculate Discount Of Product

Java
class Discount
{
	public static void main(String args[])
	{
 
	double  dis,amount,markedprice,s;
               
	markedprice=1000;
 
        dis=25;  // 25 mean 25%			
	
	System.out.println("markedprice= "+markedprice);
 
	System.out.println("discount rate="+dis);
         
        s=100-dis;
 
	amount= (s*markedprice)/100;
 
	System.out.println("amount after discount="+amount);
 
	}
}



9. Calculate Distance Between Two Points 
import java. lang. Math. *;
class DistanceBwPoint.
public static void main(String arg[])
{
int x1,x2,y1,y2;
double dis;
x1=1;y1=1;x2=4;y2=4;
dis=Math. sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));


11. Calculate Commission Percentage
Java
class CalculateCommission
{
	public static void main(String arg[])	
	{
         double amount=1000,commissionPercentage=15;
	 
         double commission=(commissionPercentage/100)*amount;  	   
 
     	 System.out.println("Commission amount="+commission);
	}
}




13. Power In Java
the power function in Java is Math. pow(). It is used to get the power of the first argument to the second argument. It takes two arguments and returns the value of the first argument raised to the second argument.


15. Calculate Depreciation of Value

// Java program to find depreciation of the value
// initial value, rate and time are given
import java.io.*;

class GFG
{

// Function to return the depreciation of value
static float Depreciation(float v,
						float r, float t)
{
	float D = (float)(v * Math.pow((1 - r / 100), t));

	return D;
}

// Driver code
public static void main(String[] args)
{
	float V1 = 200, R = 10, T = 2;
	
	System.out.print(Depreciation(V1, R, T));
}
}

// This code is contributed by anuj_67..



17. Calculate Batting Average
class BattingAverage. {
public static void main(String arg[]) {
int Matches=5,totalruns=200,innings=5,notout=1;
double avg;
avg=totalruns/(innings-notout);
System. out. println("batting average="+avg);
} }



19. Calculate CGPA Java Program
for(int i=0;i<n;i++)
{ sum+=g[i];
}
cgpa=sum/n;
System. out. println("cgpa="+cgpa);
System. out. println("percantage from cgpa="+cgpa*9.5);
} }


21. Compound Interest Java Program
import java.util.*;
public class Main
{
    public static void main(String args[]) 
    {
        //Take input from the user
        //Create an instance of the Scanner class
    	Scanner sc = new Scanner(System.in);
        //Declare variables
        float p, r, t, n;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the number of times that interest is compounded per unit t");
        n=sc.nextFloat();      //Initialize the variables
        sc.close();
        
        //Calculate the compound interest
    	double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}


23. Calculate Average Marks

class AverageMarks
{
  public static void main(String arg[])
  {
    int n=5,avg=0;
 
    int a[]=new int[n];
 
    a[0]=10;
 
    a[1]=20;
 
    a[2]=30;
 
    a[3]=40;
 
    a[4]=50;
 
    for(int i=0;i<n;i++)
 
    avg=avg+a[i];
 
    System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+")  is ="+ avg/n);
 
  }
}




25. Sum Of N Numbers
public class SumOfNaturalNumber1  
{  
public static void main(String[] args)   
{  
int i, num = 10, sum = 0;  
//executes until the condition returns true  
for(i = 1; i <= num; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
//prints the sum   
System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
}  
}  

27. Armstrong Number In Java
 import java.util.Scanner;  
import java.lang.Math;  
public class ArmstsrongNumberExample  
{  
//function to check if the number is Armstrong or not  
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;   
//assigning n into a temp variable  
temp=n;   
//loop execute until the condition becomes false  
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(n==sum)   
//returns if sum and n are equal  
return true;      
//returns false if sum and n are not equal  
else return false;   
}   
//driver code  
public static void main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the limit: ");  
//reads the limit from the user  
num=sc.nextInt();  
System.out.println("Armstrong Number up to "+ num + " are: ");  
for(int i=0; i<=num; i++)  
//function calling  
if(isArmstrong(i))  
//prints the armstrong numbers  
System.out.print(i+ ", ");  
}   
} 



29. Find Ncr & Npr

import java.util.Scanner;
class NcrAndNpr
{
	double fact(double n)
	{
	   int i=1;
             	    double fact=1;
	    while(i<=n)
	    {
	   	   fact=fact*i;
		   i++;
 	    }
  	      return fact;
	}
	double permutation(int n,int r )
	{
		double per=fact(n)/fact(n-r);	
		return per;
	}
	double combination(int n,int r)
	{
		double com=fact(n)/(fact(n-r)*fact(r));
		return com;
	}
	public static void main(String arg[])	
	{
		NcrAndNpr p=new NcrAndNpr( );
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
               	int n=sc.nextInt();
		System.out.println("enter value of r");
              		int r=sc.nextInt();
		if(n>=r)
		{
		System.out.println("The value of "+n+"p"+r+" is : "+p.permutation(n,r));	
		System.out.println("The value of "+n+"c"+r+" is : "+p.combination(n,r));
		}
		else
		System.out.println("n value should be greater than or equals to r value");
		
	}	
}



31. Reverse A String In Java

// java program to reverse a word

import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		
		String str= "Geeks", nstr="";
		char ch;
		
	System.out.print("Original word: ");
	System.out.println("Geeks"); //Example word
		
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ nstr);
	}
}






33. Find if a number is palindrome or not 
class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  


35. Future Investment Value

ng Input From Scanner ClassJava
import java.lang.*;
import java.util.Scanner;
class FIV
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter present value: ");
	double p=sc.nextInt();
	 System.out.print("Enter the interest rate: ");
	 double r=sc.nextInt();
	System.out.print("Enter the time period in years: ");
	 double y=sc.nextInt();
	double f=p*Math.pow((1+r/100),y);
	System.out.print("value is: "+f);
  }
}



37. HCF Of Two Numbers Program

// Java program to find GCD of two numbers
public class GFG {
	
	// Function to return gcd of a and b
	static int gcd(int a, int b)
	{
		int result = Math.min(a, b); // Find Minimum of a nd b
		while (result > 0) {
			if (a % result == 0 && b % result == 0) {
				break;
			}
			result--;
		}
		return result; // return gcd of a nd b
	}
	
	// Driver program to test above function
	public static void main (String[] args)
	{
		int a = 98, b = 56;
		System.out.print("GCD of " + a + " and " + b + " is " + gcd(a, b));
	}
}

// This code is contributed by AnkThon




39. LCM Of Two Numbers
public class Main {
  public static void main(String[] args) {

    int n1 = 72, n2 = 120, lcm;

    // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}



41. Java Program Vowel Or Consonant 
public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}



43. Perfect Number In Java
import java.util.Scanner;  
public class PerfectNumberExample1  
{  
public static void main(String args[])    
{  
long n, sum=0;  
Scanner sc=new Scanner(System.in);         
System.out.print("Enter the number: ");  
n=sc.nextLong();  
int i=1;  
//executes until the condition becomes false  
while(i <= n/2)  
{  
if(n % i == 0)  
{  
//calculates the sum of factors  
Sum = sum + i;  
} //end of if  
//after each iteration, increments the value of variable i by 1  
i++;  
} //end of while  
//compares sum with the number  
if(sum==n)  
{  
//prints if sum and n are equal  
System.out.println(n+" is a perfect number.");  
} //end of if  
else  
//prints if sum and n are not equal  
System.out.println(n+" is not a perfect number.");   
}  
}  


45. Check Leap Year Or Not
#include <stdio.h>
int main() {
   int year;
   printf("Enter a year: ");
   scanf("%d", &year);

   // leap year if perfectly divisible by 400
   if (year % 400 == 0) {
      printf("%d is a leap year.", year);
   }
   // not a leap year if divisible by 100
   // but not divisible by 400
   else if (year % 100 == 0) {
      printf("%d is not a leap year.", year);
   }
   // leap year if not divisible by 100
   // but divisible by 4
   else if (year % 4 == 0) {
      printf("%d is a leap year.", year);
   }
   // all other years are not leap years
   else {
      printf("%d is not a leap year.", year);
   }

   return 0;
}




47. Sum Of A Digits Of Number
// Java program to compute
// sum of digits in number.
import java.io.*;

class GFG {

	/* Function to get sum of digits */
	static int getSum(int n)
	{
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}

		return sum;
	}

	// Driver code
	public static void main(String[] args)
	{
		int n = 687;

		// Function call
		System.out.println(getSum(n));
	}
}

// This code is contributed by Gitanjali



49. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.Scanner;
public class Exercise7 {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}


51. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.


package com.hubberspot.java.example;

import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int[0];

        int number;
        String nextLine;
        do {
            System.out.print("Enter the number : ");
            number = scanner.nextInt();
            nextLine = scanner.nextLine();

            if(number != 0) {
                numbers = add(numbers, number);
            }

        } while(number != 0);

        int negativeSum = 0; 
        int oddSum = 0; 
        int evenSum = 0;

        for(int i = 0; i < numbers.length; i++ )
        {
            if( numbers[i] < 0 )
            {
                negativeSum = negativeSum + numbers[i];
            }
            else if( numbers[i] % 2 == 0 )
            {
                evenSum = evenSum + numbers[i];
            }
            else
            {
                oddSum = oddSum + numbers[i];
            }
        }
        System.out.println( "Sum of negative numbers : " + negativeSum );
        System.out.println( "Sum of positive even numbers: " + evenSum );
        System.out.println( "Sum of positive odd numbers: " + oddSum );

    }

    private static int[] add(int[] numbers, int number) {

        int[] tempArray = new int[numbers.length + 1];

        for(int i = 0; i < numbers.length; i++) {
            tempArray[i] = numbers[i];
        }

        tempArray[tempArray.length - 1] = number;
        return tempArray;

    }

}
