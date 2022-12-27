		Easy
1. public class Solution {
    public int mySqrt(int x) {
        int left = 1, right = x/2;
        while ( left <= right) {
            int mid = (left + right) /2;
            if (mid > x /mid) {
                right = mid - 1;
                continue;
            }
            if ((mid+1) <= x/(mid+1)) {
                left = mid + 1;
                continue;
            }
            return mid;
        }
        return x;
    }
}

2. public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= n) {
            int mid = left + (right - left) / 2;
            int g = guess(mid);
            if (g == 0) {
                return mid;
            }
            else if (g == 1) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return 0;
    }
}

3. public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        if (isBadVersion(left)) {
            return left;
        }
        return left + 1;
    }
}

4. class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length - 1;
        int[] indices = new int[2];
        while (lo < hi){
            int sum = numbers[lo] + numbers[hi];
            if (sum < target){
                lo++;
            } else if (sum > target){
                hi--;
            } else {
                indices[0] = lo + 1;
                indices[1] = hi + 1;
                break;
            }
        }
        return indices;
    }
}

5. public class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 0; i * i >= 0 && i * i <= num; i ++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}

6. public class Solution {
    public int arrangeCoins(int n) {
        if(n<0) return -1;
        if(n==0) return 0;
        int rows = 0;
        long sum = 0;
        while(sum<=n){
            sum += rows+1;
            rows++;
        }
        return rows-1;
    }
}
7. class Solution {
      public char nextGreatestLetter(char[] letters, char target) {
         int len = letters.length;
          if (target >= letters[len - 1]) {
             return letters[0];
         }
         int start = 0;
        int end = len - 1;
         while (start + 1 < end) {
             int mid = start + (end - start) / 2;
             if (letters[mid] - target > 0) {
                 end = mid;
             } else {
                 start = mid;
             }
         }
         if (letters[start] > target) {
             return letters[start];
         } else {
             return letters[end];
         }
     }
 }

8. class Solution {
  public int findKthPositive(int[] arr, int k) {
    int l = 0;
    int r = arr.length;
    while (l < r) {
      final int m = (l + r) / 2;
      if (arr[m] - m - 1 >= k)
        r = m;
      else
        l = m + 1;
    }

   
    return l + k;
  }
}

9. class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        
        if(nums.length==1 && target>nums[0]){
            return 1;
        }
        
        for(int i=0;i<nums.length-1;i++){
            if(target == nums[i]){
                result =  i;
                break;
            }else if(target>nums[i] && target<=nums[i+1]){
                result = i+1;
                break;
            }else if(target>nums[i+1] && (nums.length-1==i+1)){
                result= nums.length;
                break;
            }else if(target<nums[i] && i==0){
                result =  0;
                break;
            }else if(target>nums[i] && target>nums[i+1]){
                continue;
            }
        }
        
        return result;
        
    }
}

10. class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1]) {
                lo = mi + 1;
            } else {
                hi = mi;   
            }
        }
        return lo;
    }
}

11. 
class Solution {
  public int countNegatives(int[][] grid) {
    int total = 0;
    int n = grid[0].length;
    for (int[] gr : grid) {
      int negInd = binarySearchHelper(gr, 0, n - 1);
      if (negInd != -1) {
        total += n - negInd;
      }
    }
    return total;
  }
  
  private int binarySearchHelper(int[] arr, int start, int end) {
    int idx = -1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] < 0) {
        idx = idx == -1 ? mid : Math.min(idx, mid);
        end = mid - 1;
      }
      if (arr[mid] >= 0) {
        start = mid + 1;
      }
    }
    return idx;
  }
}


medium 
 class Solution {
    public int[] searchRange(int[] N, int T) {
        int Tleft = find(T, N, 0);
        if (Tleft == N.length || N[Tleft] != T) return new int[] {-1, -1};
        return new int[] {Tleft, find(T+1, N, Tleft) - 1};
    }
    public int find(int target, int[] arr, int left) {
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + right >> 1;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}