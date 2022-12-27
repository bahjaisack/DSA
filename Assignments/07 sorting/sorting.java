1 . public class Solution {
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
        nums[j] = temp;
    }


}

2. class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            // Map the value of num into the nums array again
            int index = Math.abs(nums[i]) - 1;
            
            if(nums[index] < 0) {
                // Have visited the element before, duplicate index + 1
                ans.add(index + 1);
                
            } else {
                // First time visit the element
                nums[index] = -nums[index];
            }
        }
        
        return ans;
    }
}

3.  