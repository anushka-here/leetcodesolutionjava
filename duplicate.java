class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        // Pointer 'i' tracks the index of the last unique element found
        int i = 0;
        
        // Pointer 'j' iterates through the entire array
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // Copy the new unique element forward
            }
        }
        
        // Return the count of unique elements
        return i + 1;
    }
}