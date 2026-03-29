class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProductWithoutZero = nums[0];
        boolean zeroInArray = false;
        boolean multipleZeros = false;
        int[] productArray = new int[nums.length];
        for(int x = 0; x<nums.length; x++){
            if(nums[x] != 0 && x != 0)
                totalProductWithoutZero *= nums[x];
            if(nums[x] == 0 && zeroInArray == true){
                multipleZeros = true;
            }
            else if(nums[x] == 0)
                zeroInArray = true;
            
        }

        for(int x = 0; x < nums.length; x++){
            if(zeroInArray && multipleZeros && nums[x] == 0){
                productArray[x] = 0;
            }
            else if(zeroInArray && nums[x] == 0){
                productArray[x] = totalProductWithoutZero;
            }
            else if(zeroInArray){
                productArray[x] = 0;
            }
            else{
                productArray[x] = totalProductWithoutZero/nums[x];
            }
        }
        return productArray;
    }
}  
