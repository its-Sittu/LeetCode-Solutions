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
