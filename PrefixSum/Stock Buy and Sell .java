class Solution {
    public int maxProfit(int[] prices) {
        
    int ans = 0;
    int min_ele = prices[0];

    for(int i = 0; i<prices.length; i++){

      min_ele = Math.min(min_ele , prices[i]);
      int profit = prices[i] - min_ele;

      ans = Math.max(ans ,profit);
    }
    return ans;
    }
}







// for multiple transactions value addition

class Solution {
    int stockBuySell(int arr[]) {
        // code here
        
        int profit = 0;
        
        for (int i = 1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }
}

