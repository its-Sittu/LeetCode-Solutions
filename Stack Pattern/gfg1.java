class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n = arr.length;
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
         ans.add(-1);
         stack.push(arr[0]);
         
         for(int i=1; i<n; i++){
             while(!stack.isEmpty() && stack.peek()>= arr[i]){
                 stack.pop();
             }
             
             if(stack.isEmpty()){
                 ans.add(-1);
             }else{
                 ans.add(stack.peek());
             }
             stack.push(arr[i]);
         }
         return ans;
    }
}
