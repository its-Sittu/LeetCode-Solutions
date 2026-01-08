class Solution {
    static int subArraySum(int arr[], int tar) {
        //  code here
        int n = arr.length;
        int sum =0;
        int count = 0;
        
        HashMap<Integer ,Integer> map = new HashMap<>();
         map.put(0, 1);
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            
            if(map.containsKey(sum - tar)){
                count += map.get(sum - tar);
            }
            map.put(sum , map.getOrDefault(sum ,0) + 1);
        }
        return count;
    }
}
