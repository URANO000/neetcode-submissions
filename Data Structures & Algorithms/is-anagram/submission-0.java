class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            // Current letter as key
            Character letterS = s.charAt(i);
            Character letterT = t.charAt(i);
            // Get the value related to the key, if no value, return 0
            int lastValueS = mapS.getOrDefault(letterS, 0);
            int lastValueT = mapT.getOrDefault(letterT, 0);
            // Update the value by 1
            int newValueS = lastValueS + 1;
            int newValueT = lastValueT + 1;
            // Put in map
           mapS.put(letterS, newValueS);
           mapT.put(letterT, newValueT);
        }

        // Check if both end up the same. If anagrams, returns true, if not, false
        return mapS.equals(mapT);
    }
}
