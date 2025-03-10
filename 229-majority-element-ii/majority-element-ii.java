class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n = nums.length ;
       List<Integer> ls = new ArrayList <>();
       
        for (int i = 0 ; i < n;i++){
            if (ls.size() == 0 || ls.get(0) != nums[i]){
                       int count = 0 , el = nums[i] ;
            for (int j = i; j <n; j++){
                if (el == nums[j]){
                        count ++ ;
                }
            }
            if (count > (n/3)) ls.add(nums[i]);
            }
           if (ls.size() == 2) break  ;
        }
        return ls ;
    }
}


