class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if(digits.length() < 1 || digits == "")
            return list;
        String[] str = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        recrurse(digits, str, 0, "", list);
        return list;
    }
    public void recrurse (String digits, String[] mapping, int index,String current, List<String> list)
    {
        if(current.length() == digits.length())
        {
            list.add(current);
            return;
        }
        String letters = mapping[Integer.parseInt(""+digits.charAt(index))];
        for(int i = 0; i < letters.length(); i++)
        {
            recrurse(digits, mapping, index + 1, current + letters.charAt(i), list);
        }
    }
}
