// brute force

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans =  new int[nums1.length];

        // for outer loop

        for(int i =0; i< nums1.length; i++){
             int element = nums1[i];
             int nextGE = -1;

             for(int j = 0; j<nums2.length; j++){
                if(nums2[j] == element){
                  for(int k = j+1; k<nums2.length; k++){
                      if(nums2[k]>element){
                        nextGE = nums2[k];
                        break;
                      }
                  }
                  break;
             }

        }
        ans[i] = nextGE;
    }
    return ans;
}
}
