class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] new1  = new int [nums.length];
        int temp = 0 ; 
        int temp1 = 1 ;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] > 0){
                new1[temp] = nums[i];
                temp+=2 ;
            }
            else{
                new1[temp1] = nums[i];
                temp1+=2 ;
            }
        }
        return new1 ;
    }
}