class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x = 0; x<nums.length; x++){
            diff = target - nums[x];
            if(map.containsKey(diff))
                return new int[]{map.get(diff), x};
            else
                map.put(nums[x], x);
        }
        return new int[]{0,0};
    }
}
