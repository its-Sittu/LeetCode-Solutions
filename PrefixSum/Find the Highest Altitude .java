class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int [] prefixsum = new int [n];
        prefixsum[0] = gain[0];

        for(int i =1; i<n; i++){
            prefixsum[i] = prefixsum[i-1] + gain[i];
        }
        int maxhigh = 0;

        for(int i=0; i<n; i++){
            maxhigh = Math.max(maxhigh , prefixsum[i]);
        }
        return maxhigh;
    }
}



HINT .......................................................
1) Prefix sum = actual altitude

2) Max tracking = highest point
