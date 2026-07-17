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
