// brute force 

class Solution {
    public int mySqrt(int x) {

        int ans = 0;
        for (int i = 0; i <=x; i++) {

            if ((long)i * i <= x) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
}





// optimise ~ by Using Binary Search

class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            long sqr = (long) mid * mid;

            if (sqr == x) {
                return mid;
            } else if (sqr < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
