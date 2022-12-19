 Easy
 
1. class Solution {
public int[] buildArray(int[] nums) {
    int n = nums.length;
    for(int i=0;i<n;i++){
        nums[i]=n*(nums[nums[i]]%n)+nums[i];
    }
    for(int i=0;i<n;i++){
        nums[i]=nums[i]/n;
    }
    return nums;
}
}

2.class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[]ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
 
3. class Solution {
    public int[] runningSum(int[] nums) {
    int[] ans = new int[nums.length];
    ans[0] = nums[0];
    for (int i = 1; i < nums.length; i++)
        ans[i] = ans[i-1] + nums[i];
    return ans;
    }
}

4. class Solution {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        
        for(int i=0;i<accounts.length;i++)
        {
            int count=0;
            for(int j=0;j<accounts[i].length;j++)      
            {
                count+=accounts[i][j];
            }
            res= Math.max(res,count);
            
        }
        return res;
        
    }
}
5. class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        return result;
    }
}
6. class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int i=0; i<candies.length; i++) {
            if(candies[i] > max) max = candies[i];
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                ans.add(true);
            } else ans.add(false);
        }
        return ans;
    }
}
7. class Solution {
    public static int numIdenticalPairs(int[] nums) 
    {
        int res = 0;
        Map<Integer,Integer> count= new HashMap<Integer,Integer>();
        for (int a: nums)
        {
            int cur=count.getOrDefault(a,0);
            res += cur;
            count.put(a,cur+1);
        }
        return res;
    }
    public static void main(String args[])
    {
       int nums[]={1,2,3,1,1,3};
  
       System.out.println( numIdenticalPairs(nums));
        
    }
}

8. class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];    

        for (int x = 0; x < nums.length; x++) {
            int ctr = 0;
            for (int y = 0; y < nums.length; y++) {
                if (nums[y] < nums[x]) {
                    ctr++;
                }
                result[x] = ctr;
            }
        }       
        return result;
    }
    }

9. class Solution {
  public int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      list.add(index[i], nums[i]);
    }
    int[] ans = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      ans[i] = list.get(i);
    }
    return ans;
  }
}

10. class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
medium 
1. class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
       int m=matrix.length;
          List<Integer>res=new ArrayList<>();
          if(m==0)
          return res;
        int n=matrix[0].length;
        
        int rowstart=0;
        int rowend=m;
        int colstart=0;
        int colend=n;
        
        int k;
        
        while(rowstart<rowend && colstart<colend)
        {
          
            for(k=colstart;k<colend;k++)
            res.add(matrix[rowstart][k]);
            rowstart+=1;
            
            for(k=rowstart;k<rowend;k++)
            res.add(matrix[k][colend-1]);
            colend-=1;
            
            if(rowstart<rowend)
            {
                for(k=colend-1;k>=colstart;k--)
                res.add(matrix[rowend-1][k]);
                rowend-=1;
            }
            
            if(colstart<colend)
            {
                for(k=rowend-1;k>=rowstart;k--)
                res.add(matrix[k][colstart]);
                colstart+=1;
            }
            
        }
        return res;   
    }
} 

2. class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        int rowBegin = 0, rowEnd = n-1,colBegin = 0, colEnd = n-1;
        int k = 1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            
            for(int i = colBegin; i <= colEnd; i++){
                matrix[rowBegin][i] = k++;
            }
            rowBegin++;
            for(int i = rowBegin; i <= rowEnd; i++){
                matrix[i][colEnd] = k++;
            }
            colEnd--;
            
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    matrix[rowEnd][i] = k++;
                }
            }
            rowEnd--;
            
            if(colBegin <= colEnd){
                for(int i = rowEnd; i>= rowBegin; i--){
                    matrix[i][colBegin] = k++;
                }
            }
            colBegin++;
            
        }
        
        return matrix;
    }
}

3. class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};

        int[][] ans = new int[R*C][2];
        int t = 0;

        ans[t++] = new int[]{r0, c0};
        if (R * C == 1) return ans;

        for (int k = 1; k < 2*(R+C); k += 2)
            for (int i = 0; i < 4; ++i) {  // i: direction index
                int dk = k + (i / 2);  // number of steps in this direction
                for (int j = 0; j < dk; ++j) {  // for each step in this direction...
                    // step in the i-th direction
                    r0 += dr[i];
                    c0 += dc[i];
                    if (0 <= r0 && r0 < R && 0 <= c0 && c0 < C) {
                        ans[t++] = new int[]{r0, c0};
                        if (t == R * C) return ans;
                    }
                }
            }

        throw null;
    }
}

4. public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColumnZero = false;

        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                firstColumnZero = true;
                break;
            }
        }
 
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
                }
            }
        }
 
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                   matrix[i][j] = 0;
                }
            }
        }
 
        if(firstColumnZero){
            for(int i=0; i<matrix.length; i++)
                matrix[i][0] = 0;
        }
 
        if(firstRowZero){
            for(int i=0; i<matrix[0].length; i++)
                matrix[0][i] = 0;
        }
 
    }}

5. class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int[] product = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            product[i] = left;
            left *= nums[i]; 
        }
        
        for(int i = nums.length -1; i > -1; i--)
        {
            product[i] = right*product[i];  // left * right
            right *= nums[i];             
        }
        return product;
    }
}
 

HARD
1. class Solution {
  public int findMaxValueOfEquation(int[][] points, int k) {
    int ans = Integer.MIN_VALUE;
    // (y - x, x)
    Queue<Pair<Integer, Integer>> maxHeap = new PriorityQueue<>(
        (a, b) -> a.getKey() == b.getKey() ? b.getValue() - a.getValue() : b.getKey() - a.getKey());

    for (int[] p : points) {
      final int x = p[0];
      final int y = p[1];
      while (!maxHeap.isEmpty() && x - maxHeap.peek().getValue() > k)
        maxHeap.poll();
      if (!maxHeap.isEmpty())
        ans = Math.max(ans, x + y + maxHeap.peek().getKey());
      maxHeap.offer(new Pair<>(y - x, x));
    }

    return ans;
  }
}

2. public class Solution {
    public int firstMissingPositive(int[] nums) {

       for (int i = 0; i < nums.length; ) {
            if (nums[i] > 0 && i != nums[i] - 1 && nums[i] -1 < nums.length && nums[nums[i] -1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
            } else{
                i ++;
            }
        }

        for(int i = 0; i < nums.length; i ++) {
            if (nums[i] !=i+1)
                return i+1;
        }

        return nums.length + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];

        nums[i] = nums[j];
        nums[j] = temp;
    }


}

3. public class Solution {
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        for (int element : nums) {
            ans = gcd(ans, element);
            if (ans == 1) {
                return true;
            }
        }
        return false;
    }
}
