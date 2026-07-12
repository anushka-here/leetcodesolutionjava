public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Maps a character to its last seen index + 1 (next possible valid left boundary)
        HashMap<Character, Integer> map = new HashMap<>(); 
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character is already in the window, slide the left pointer
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar));
            }
            
            // Update the last seen position of the character
            map.put(currentChar, right + 1);
            
            // Calculate the current window size and update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}