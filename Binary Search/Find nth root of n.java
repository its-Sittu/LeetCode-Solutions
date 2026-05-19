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
