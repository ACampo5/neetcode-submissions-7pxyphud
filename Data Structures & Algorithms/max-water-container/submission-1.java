class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxWater = 0;

        while(left < right){
            int area = (right - left) * Math.min(heights[left], heights[right]);
            maxWater = Math.max(maxWater, area);
            if(heights[left] < heights[right]){
                left ++;
            }
            else if (heights[right] < heights[left]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxWater;
    }
        
}
