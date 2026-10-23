public class Solution {
    public bool hasDuplicate(int[] nums) {
        // Thinking of duplicates -> HashSet
        HashSet<int> unique = new HashSet<int>();

        foreach(int num in nums){
            if(unique.Contains(num)){
                return true;
            }
            unique.Add(num);
        }

        // If no duplicates at all
        return false;
        
    }
}