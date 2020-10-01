class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length && diff !=0; i++)
        {
            int a = i + 1;
            int b = nums.length - 1;
            while (a < b)
            {
                int sum = nums[i] + nums[a] + nums[b];
                if(Math.abs(target - sum) < Math.abs(diff))
                {
                    diff = target - sum;
                }
                if(sum < target)
                    a++;
                else
                    b--;
                    
            }
        }
        return target - diff;
    }
}
