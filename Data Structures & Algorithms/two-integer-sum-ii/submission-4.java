class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int sum;
        for(int x = 0; x< numbers.length; x++){
            sum = numbers[left] + numbers[right];
            if(left == right || sum == target){
                break;
            }

            if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }

        return new int[]{left+1, right+1};
    }
}
