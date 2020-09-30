class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
        String s = String.valueOf(x);
        int a_pointer = 0;
        int b_pointer = s.length() - 1;
        while(a_pointer < b_pointer)
        {
            if(s.charAt(a_pointer) != s.charAt(b_pointer))
               return false;
            a_pointer++;
            b_pointer--;
        }
        return true;
    }
}
