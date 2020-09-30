class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() < 0)
            return 0;
        int res = 0;
        int a_pointer = 0;         

        HashMap<String, Integer> map = new HashMap<>();
        map.put( "I", 1);
        map.put("IV", 4);
        map.put( "V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put( "XL", 40);
        map.put( "L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put( "CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        
        while(a_pointer < s.length())
        {
            String  tmp = "";
            if(a_pointer + 1 >= s.length())
            {
                res += map.get(""+s.charAt(s.length()  - 1)); 
                break;
             }
            else if(map.get(""+s.charAt(a_pointer + 1)) > map.get(""+s.charAt(a_pointer)))
            {
                tmp = tmp + s.charAt(a_pointer) + s.charAt(a_pointer + 1);
                a_pointer += 2;
            }else
            {
                tmp += s.charAt(a_pointer);
                a_pointer++;
            }
            res += map.get(tmp);
           
        }
        return res;
    }
    
}
