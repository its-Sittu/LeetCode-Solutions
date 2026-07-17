class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        
        int ans1 = 0;
        while(n % 2 == 0){
            n = n / 2;
            ans1 = 2;
        }
        
        for(int i = 3; i*i<=n; i+=2){
            
            while(n % i == 0){
                n = n / i;
                ans1 = i;
            }
        }
        
        if(n > 2){
            ans1 = n;
        }
        return ans1;
    }
}
