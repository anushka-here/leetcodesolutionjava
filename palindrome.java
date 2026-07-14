class Solution {
    public boolean isPalindrome(int x) {
        // Edge cases: negative numbers and numbers ending in 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNum = 0;
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }

        // For even length numbers: x == reversedNum
        // For odd length numbers: x == reversedNum / 10 (gets rid of the middle digit)
        return x == reversedNum || x == reversedNum / 10;
    }
}