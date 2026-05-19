// brute force 

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        for(int i = 0; i <=m; i++){
            
            
            long power = (long) Math.pow(i,n);
            if(power == m){
                return i;
            } else if(power > m){
                break;
            }
        }
        return -1;
    }
}

















// optimise code 

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low = 0;
        int high = m;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            long power = (long) Math.pow(mid , n);
            
            if(power == m){
                return mid;
            } else if(power > m){
                high = mid -1;
            } else{
                low = mid + 1;
            }
        }
        return -1 ;
    }
}
