class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //[-4 -1 -1 0 1 2]
        List<List<Integer>> list = new LinkedList<>();
        if(nums.length < 1 || nums == null)
            return list;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || i > 0 && nums[i] != nums[i-1])
            {
                int a = i + 1;
                int b = nums.length - 1;
                int sum = 0 - nums[i];
                while(a < b)
                {
                    if(nums[a] + nums[b] == sum)
                    {
                        list.add(Arrays.asList(nums[a], nums[b], nums[i]));
                        while(a < b && nums[a] == nums[a + 1]) a++;
                        while(a < b && nums[b] == nums[b - 1]) b--;
                        a++;
                        b--;
                    }else if(nums[a] + nums[b] > sum)
                        b--;
                    else
                        a++;
                }
            }
        }
        return list;
    }
}
