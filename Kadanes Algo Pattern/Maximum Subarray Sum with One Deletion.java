class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int prevNodel = arr[0];
        int prevOnedel = 0;
        int res = arr[0];

        for(int i =1; i<n; i++){
            prevOnedel = Math.max(prevOnedel+ arr[i] ,prevNodel);
            prevNodel = Math.max(prevNodel+arr[i] , arr[i]);
            int current = Math.max(prevOnedel , prevNodel);
            res = Math.max(res , current);
        }
        return res;
    }
}

//  Practice and dry Run............
