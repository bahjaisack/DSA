Sum Triangle from Array GFG


Input: arr[] = {4, 7, 3, 6, 7};
Output:
81
40 41
21 19 22
11 10 9 13
4 7 3 6 7 

Input: {10, 40, 50}



Maximum and Minimum value in an array GFG

import java.io.*;
 
class GFG {
 
    static int getMin(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }
 
    static int getMax(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
        return res;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 12, 1234, 45, 67, 1 };
        int n = arr.length;
        System.out.println("Minimum element of array: " + getMin(arr, n));
        System.out.println("Maximum element of array: " + getMax(arr, n));
    }
}



Binary Search using recursion leetcode

class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        return binarySearch(nums, target, 0, nums.length-1);
    }
    public boolean binarySearch(int[] nums, int target, int lo, int hi){
        if(lo > hi) return false;
        int mid = lo +(hi-lo)/2;
        if(nums[mid] == target) return true;
        if(nums[mid] < nums[hi] || nums[mid] < nums[lo]){
            if(target > nums[mid] && target <= nums[hi]){
                return binarySearch(nums, target, mid+1, hi);
            } else return binarySearch(nums, target, lo, mid-1);
        }
        if(nums[mid] > nums[lo] || nums[mid] > nums[hi]){
            if(target < nums[mid] && target >= nums[lo]){
                return binarySearch(nums, target, lo, mid-1);
            } else return binarySearch(nums, target, mid+1, hi);
        }
        return binarySearch(nums, target, mid+1, hi) || binarySearch(nums, target, lo, mid-1);
    }
}


First Uppercase Letter in a String GFG


// Java program to convert first character
// uppercase in a sentence
class GFG {
 
    static String convert(String str)
    {
 
        // Create a char array of given String
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
 
            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' ||
                ch[i] != ' ' && ch[i - 1] == ' ') {
 
                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {
 
                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
 
            // If apart from first character
            // Any one is in Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z')
 
                // Convert into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');           
        }
 
        // Convert the char array to equivalent String
        String st = new String(ch);
        return st;
    }
 
    public static void main(String[] args)
    {
        String str = "gEEks fOr GeeKs";
        System.out.println(convert(str));
    }
}




Reverse String leetcode

/*
LeetCode: 344. Reverse String   
Easy
Link: https://leetcode.com/problems/reverse-string
Topics: Two Pointers, String
Acceptance: 63.3
Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.
Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/

// Java
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0;i<n/2;i++){
            s[i] = (char)(s[i]+s[n-i-1]);
            s[n-i-1] = (char)(s[i]-s[n-i-1]);
            s[i] = (char)(s[i]-s[n-i-1]);
        }
    }
}

// C++
/*
class Solution {
public:
    void reverseString(vector<char>& s) {
        int n = s.size();
        for(int i=0;i<n/2;i++){
            s[n-i-1] += s[i];
            s[i]=s[n-i-1]-s[i];
            s[n-i-1] = s[n-i-1]-s[i]; 
        }
    }
};
*/




Print 1 To N Without Loop GFG

Input:
N = 5
Output:
1 2 3 4 5
Explanation:
We have to print numbers from 1 to 5.

Fibonacci Number leetcode
input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.




Special Fibonacci CodeChef

Constraints
1<=T<=10001<=T<=1000
0<=a,b,n<=10^90<=a,b,n<=10 
9
 
Sample Input
4
86 77 15
93 35 86
92 49 21
62 27 90
Sample Input
86
126
92
62





Length of string using Recursion GFG
Input : str = "abcd"
Output :4

Input : str = "GEEKSFORGEEKS"
Output :13



Geek-onacci Number GFG

import java.io.*;
import java.lang.*;
import java.util.*;
 
class GFG {
 
    // Function to calculate the
    // N-th Geek-onacci Number
    static int find(int A, int B,
                    int C, int N)
    {
        // Stores the geekonacci series
        int[] arr = new int[N];
 
        // Store the first three
        // terms of the series
        arr[0] = A;
        arr[1] = B;
        arr[2] = C;
 
        // Iterate over the range [3, N]
        for (int i = 3; i < N; i++) {
 
            // Update the value of arr[i]
            // as the sum of previous 3
            // terms in the series
            arr[i] = arr[i - 1]
                     + arr[i - 2]
                     + arr[i - 3];
        }
 
        // Return the last element
        // of arr[] as the N-th term
        return arr[N - 1];
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int A = 1, B = 3, C = 2, N = 4;
        System.out.print(find(A, B, C, N));
    }
}

