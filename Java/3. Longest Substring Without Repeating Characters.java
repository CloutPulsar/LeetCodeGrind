class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a,b;
        a = b = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(b < s.length())
        {
            if(!set.contains(s.charAt(b)))
            {
                set.add(s.charAt(b));
                b++;
            }
            else
            {
                set.remove(s.charAt(a));
                a++;
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
}
