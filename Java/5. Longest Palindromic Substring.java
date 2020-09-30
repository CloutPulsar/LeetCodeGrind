class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1)
            return "";
        int max = 0;
        int start, end;
        start = end = 0;
        for(int i = 0; i < s.length(); i++){
            int a = getLongest(s, i, i);
            int b = getLongest(s, i, i+1);
            max = Math.max(a, b);
            if(max > end - start){
                start = i - (max -1)/2;
                end = i + (max / 2);
            }
        }
        return s.substring(start, end+1);
    }
    public int getLongest(String s, int a , int b){
        while(a > -1 && b < s.length() && (s.charAt(a) == s.charAt(b)) )
        {
            a--;
            b++;
        }
        return b - a - 1;
    }
}
//cbbd
//racecar
