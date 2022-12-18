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
