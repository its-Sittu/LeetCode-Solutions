// brute code 

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        int n = arr.length;
        
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i<n-k+1; i++ ){
            
            int ans = 0;
            
            for(int j = i; j<i+k; j++){
                
                if( arr[j] < 0){
                    
                    ans = arr[j];
                    break;
                    
                } 
            }
             list.add(ans);
            
        }
        return list;
    }
}
