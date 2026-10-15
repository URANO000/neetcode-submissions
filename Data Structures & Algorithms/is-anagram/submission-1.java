class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            // Put in map with all the checks in one line
           mapS.put(s.charAt(i),(mapS.getOrDefault(s.charAt(i), 0)) + 1);
           mapT.put(t.charAt(i),(mapT.getOrDefault(t.charAt(i), 0)) + 1);
        }

        // Check if both end up the same. If anagrams, returns true, if not, false
        return mapS.equals(mapT);
    }
}
