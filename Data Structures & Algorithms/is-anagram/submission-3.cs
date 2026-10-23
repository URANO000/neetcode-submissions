public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length) return false;

        Dictionary<char, int> word1 = new Dictionary<char, int>();
        Dictionary<char, int> word2 = new Dictionary<char, int>();

        for(int i = 0; i < s.Length; i++){
            if(word1.ContainsKey(s[i])){
                word1[s[i]] = word1[s[i]] + 1;
            }
            else 
            {
                word1.Add(s[i], 1);
            }

            if(word2.ContainsKey(t[i])){
                word2[t[i]] = word2[t[i]] + 1;
            }
            else{
                word2.Add(t[i], 1);
            }
        }

        // Check equality
        if(word1.Count == word2.Count && !word1.Except(word2).Any()){
            return true; // They are anagrams
        }
        else {
            return false; // They are not anagrams
        }

    }
}
