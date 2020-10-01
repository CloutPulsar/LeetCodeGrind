class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2 || s == null)
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' ||s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if(stack.isEmpty() || map.get(stack.pop()) != s.charAt(i))
                return false;
                      
        }
        if(!stack.isEmpty())
            return false;
        else
            return true;
    }
}
