class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort (nums);
        int n = nums.length ;
        int i = 1 , j = nums.length-1;
        int ans [] = new int [n];
        while (i<n ){
                ans[i] = nums[j];
                i = i+2 ;
                j--;
        }
         i =0 ;
        while (i <n ){
                     ans[i] = nums[j];
                   i = i+2 ;
                 j--;
        }
        for (int k = 0 ; k< n;k++){
            nums[k] = ans[k];
        }
    }
}