
Prefix array → overall cumulative sum

Har query → subarray ke start ko zero consider karke maximum nikalna

base = prefix sum just before start → subtract karke relative sum milta hai

Loop → calculate max of these relative sums






class Solution {
    public List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex,
                                     List<Integer> rightIndex) {
        // code here.
       List<Integer> result = new ArrayList<>();

    int n = arr.size();
    if (n == 0) return result;

        ArrayList<Integer> prefix = new ArrayList<>();
        prefix.add(arr.get(0));
        
        for(int i=1; i<n; i++){
            prefix.add(prefix.get(i -1) + arr.get(i));
        }
        
         // Step 2: Process each query
    int q = leftIndex.size();
    
    for(int i=0; i<q; i++){
        int L = leftIndex.get(i);
        int R = rightIndex.get(i);
        
        int maxValue = Integer.MIN_VALUE;
        
        int base = (L == 0) ? 0 : prefix.get(L-1);

        for(int j = L; j<=R; j++){
            maxValue = Math.max(maxValue , prefix.get(j) - base);
        }
        result.add(maxValue);
    }
    return result;
    }
}







