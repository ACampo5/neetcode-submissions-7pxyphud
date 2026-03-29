class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x = 0; x < nums.length; x++){
            if(x == 0)
                map.put(nums[x], 1);
            else if(nums[x]-1 == nums[x-1]){
                map.put(nums[x], map.get(nums[x-1])+1);
            }
            else if(nums[x] == nums[x-1]){
                map.put(nums[x], map.get(nums[x-1]));
            }
            else{
                map.put(nums[x], 1);
            }
        }
        return map.values().stream().mapToInt(Integer::intValue).max().orElse(0);
    }
}
