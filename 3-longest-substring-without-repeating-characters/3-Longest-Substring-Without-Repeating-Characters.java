class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[128];
        int maxlen  = 0;

        for(int right = 0 , left = 0; right<s.length() ; right++){
            char c = s.charAt(right);

            left = Math.max(left, charIndex[c]);

            maxlen = Math.max(maxlen,right-left+1);

            charIndex[c] = right + 1;
        }

        return maxlen;
    }
}