public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> complements = new Dictionary<int,int>();
        for(int i = 0; i < nums.Length; i++){
            int remaining = target - nums[i];
            if(complements.ContainsKey(remaining)){
                return new int[]{complements[remaining], i};
            }
            else{
                complements.Add(nums[i], i);
            }
        
        }

        // If no pairs
        return nums;
    }
}
