// GFG Problem Solution
class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        list.add(arr[0]);
        
        for(int i=1; i<n; i++){
            list.add(list.get(i-1)+ arr[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        int m =queries.length;
        for(int i=0; i<m; i++){
            int L = queries[i][0];
            int R = queries[i][1];
            
            if(L == 0){
                ans.add(list.get(R));
            }else{
                ans.add(list.get(R) - list.get(L-1));
            }
        }
        return ans;
    }
}







// Leetcode - 303 ..................................................................



class NumArray {

    int[] prefixsum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixsum = new int[n];
        prefixsum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        if (left == 0) {
            return prefixsum[right];
        } else {
            return prefixsum[right] - prefixsum[left - 1];
        }
    }
}

