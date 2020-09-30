class Solution {
    public String intToRoman(int num) {
        if(num < 0)
            return "";
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4,"IV");
        map.put(5, "V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put( 500,"D");
        map.put( 900, "CM");
        map.put( 1000, "M");
        
        int[] nums = new int[] {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder str = new StringBuilder();
        int ptr = nums.length - 1;
        while(num != 0)
        {
            if(num - nums[ptr] >= 0)
            {
                num = num- nums[ptr];
                str.append(map.get(nums[ptr]));
            }
            else
                ptr--;
        }
        return str.toString();
    }
}
