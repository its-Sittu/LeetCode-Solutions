class Solution {
    public int lcm(int a, int b) {
        // code here
        int ans = 0;
        int ans1 = 0;
        int res = 0;
        int min = 0;
        int c = a* b;
        
        ans = Math.min(a , b);
        ans1 = Math.max(a, b);
        
        while(ans1 >= ans && ans != 0){
            min = ans;
            ans = ans1 % ans;
            ans1 = min;
        }
        
        res = c / ans1;
        
        return res;
      
    }
}


// Clean code.......

class Solution {
    public int lcm(int a, int b) {
        
        int product = a * b;

        int x = Math.max(a, b);
        int y = Math.min(a, b);

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        // x = HCF
        return product / x;
    }
}
