class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] array = s.toCharArray();
        int left = 0;
        int right = array.length-1;
        for(int x = 0; x < array.length; x++){
            if(array[left] != array[right]){
                return false;
            }
            else if(left == right){
                break;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
