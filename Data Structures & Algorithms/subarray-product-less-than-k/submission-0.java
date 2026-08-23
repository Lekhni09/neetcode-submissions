class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int product = 1;
        int sumOfCount = 0;

        if(k<=1) return 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            
            sumOfCount += right-left+1; 
        }
        return sumOfCount;
    }
}