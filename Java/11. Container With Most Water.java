class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length < 0)
            return 0;
        
        int max = 0;
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        while(a_pointer < b_pointer)
        {
            max = Math.max(max, (Math.min(height[a_pointer], height[b_pointer]) * (b_pointer - a_pointer)));
            if(height[a_pointer] < height[b_pointer])
                a_pointer++;
            else
                b_pointer--;
        }
        return max;
    }
}
