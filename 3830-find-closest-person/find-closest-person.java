class Solution {
    public int findClosest(int x, int y, int z) {
      int count1 =  0 , count2 =  0 , count3 = 0;
     if ( Math.abs(x-z) > Math.abs (y-z) )  return count1  = 2;
      if ( Math.abs(y-z) > Math.abs (x-z) )  return count2  = 1;
      else  return count3 = 0 ;
    

    }
}