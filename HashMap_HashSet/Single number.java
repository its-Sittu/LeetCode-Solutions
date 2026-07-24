// hashmap

class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<>();

        int n = nums.length;
      
      for(int num : nums){
        if(!map.containsKey(num)){
            map.put(num , 0);
        } else{
            map.put(num, map.get(num)+1);
        }
      }

      for(int num : nums){
        if(map.get(num) != 1){
            return num;
        }
      }
      return -1;
    }
}
