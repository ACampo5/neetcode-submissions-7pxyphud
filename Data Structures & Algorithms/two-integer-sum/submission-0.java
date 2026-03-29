class Solution {
    public int[] twoSum(int[] nums, int target) {
       int other;
       for(int x = 0; x<nums.length-1; x++){
            other = target-nums[x];
            for(int y = x+1; y<nums.length; y++){
                if(nums[y] == other)
                return new int[]{x, y};
            }
       }
       return new int[]{0,0};
    }
}
