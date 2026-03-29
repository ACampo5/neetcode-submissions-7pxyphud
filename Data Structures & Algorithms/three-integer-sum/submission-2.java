class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> array = new ArrayList<>();
        HashSet<List<Integer>> seen = new HashSet<>();
        int right, left, sum;

        for(int x = 0; x < nums.length-2; x++){
            left = x+1;
            right = nums.length-1;
            while(left < right){
                sum = nums[x] + nums[left] + nums[right];
                ArrayList<Integer> list = new ArrayList<>(List.of(nums[x], nums[left], nums[right]));
                if(sum == 0 && (!seen.contains(list))){
                    array.add(list);
                    seen.add(list);
                }
                else if(sum > 0){
                    right --;
                }
                else {
                    left++;
                }
            }
        }
        return array;
    }
}
