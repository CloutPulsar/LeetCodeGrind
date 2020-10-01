class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> list = new LinkedList<>();
        if(n < 1)
            return list;
        backtrack(list, "", 0, 0, n);
        return list;
    }
    public void backtrack(List<String> list, String current, int index, int end, int max)
    {
        if(current.length() == max * 2)
        {
            list.add(current);
            return;
        }
        if(index < max)
            backtrack(list, current+"(", index + 1, end, max);
        if(end < index)
            backtrack(list, current+ ")", index, end + 1, max);
    }
}
