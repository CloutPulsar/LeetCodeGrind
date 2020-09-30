class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2)
            return new int[2];
        int a = 0;
        int b = nums.length - 1;
        int size = nums.length;
        ArrayList<Integer> map = new ArrayList<>();
        for (int i = 0; i < size; i++)
            map.add(nums[i]);
        Arrays.sort(nums);
        while(a < b)
        {
            if((nums[a] + nums[b]) < target)
                a++;
            else if((nums[a] + nums[b]) > target)
                b--;
            else if((nums[a] + nums[b]) == target)
            {
                int[] res = new int[2];
                if(nums[a] == nums[b])
                {
                    res[0] = map.indexOf(nums[a]);
                    res[1] = map.lastIndexOf(nums[a]);
                }
                else
                {
                    res[0] = map.indexOf(nums[a]);
                    res[1] = map.lastIndexOf(nums[b]);
                }       
                return res;
            }
        }
        return new int[2];
    }
}
