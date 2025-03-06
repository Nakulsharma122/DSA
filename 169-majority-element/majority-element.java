class Solution {
    public int majorityElement(int[] nums) {
        int count =  0 ;
        int el = 0 ;
        for (int i = 0 ; i < nums.length ;i++){
            if (count == 0){
                    count = 1 ;
                    el = nums[i];
            }
            else if (el == nums[i]){
                    count ++;
            }
            else {
                 count -- ;
            }
        }
        // check if the elements are in majority 
        int count1 = 0 ;
        for (int i = 0 ; i < nums.length ;i++){
             if (el == nums[i]){
                count1 ++ ;
             }
        }
        if (count1 >(nums.length /2) ) return el ;
        return -1 ;
    }
}