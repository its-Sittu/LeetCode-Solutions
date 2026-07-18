//Brute force

class Solution {
    int floorSqrt(int n) {

        int ans = 0;

        for (int i = 1; i * i <= n; i++) {
            ans = i;
        }

        return ans;
    }
}


// formula

class Solution {
    int floorSqrt(int n) {
        // code here
        return (int)Math.sqrt(n);
    }
}

// Binary Search

class Solution {
    int floorSqrt(int n) {
        // code here
        int low = 1;
        int high = n;
        int ans = 0;
        
        while(low <= high ){
            
            int mid = low + (high - low)/2;
            
            long square = 1L*mid*mid;
            
            if(square == n){
                return mid;
            } else if(square <n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
}
