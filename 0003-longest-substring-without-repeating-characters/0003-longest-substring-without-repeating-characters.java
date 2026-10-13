class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int curSize = 0;
        int maxSize = 0;
        int j = 0;

        for(int i = 0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
                curSize--;
            }
            set.add(s.charAt(i));
            curSize++;
            maxSize = Math.max(maxSize, curSize);

        }
        return maxSize;
    }
}