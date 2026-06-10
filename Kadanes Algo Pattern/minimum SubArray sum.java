(* Smallest sum contiguous subarray *)


class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int n = size;
        int bestEnd = a[0];
        int MinAns = a[0];
        
        for(int i =1; i< n; i++){
            int v1 = bestEnd + a[i];
            int v2 = a[i];
            bestEnd = Math.min(v1 , v2);
            MinAns = Math.min(MinAns , bestEnd);
        }
        return MinAns;
    }
}
