class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        // first sort the array and remove duplicates
        Set<Integer> set = new HashSet<>();
        int longestStreak = 0;
        for (int num : nums) {
            set.add(num);
        }

        // now work on the new set
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentSum = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSum += 1;
                }

                longestStreak = Math.max(longestStreak, currentSum);
            }
        }
        return longestStreak;
    }
}
