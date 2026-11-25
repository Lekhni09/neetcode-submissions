class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0, count = 0;

        for (int num : nums) {
            count = (num == 1) ? count + 1:0;
            result = Math.max(count, result);
        }
        return result;
    }
}