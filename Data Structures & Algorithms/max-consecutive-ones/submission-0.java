class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Define my variables
        int max = 0;
        int count = 0;

        // Iterate through array
        for (int i = 0; i < nums.length; i++) {
            // Check my conditions
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}