//Brute code
class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int largest = nums[i];
            int smallest = nums[i];

            for (int j = i + 1; j < n; j++) {
                largest = Math.max(largest, nums[j]);
                smallest = Math.min(smallest, nums[j]);

                sum += (largest - smallest);
            }
        }
        return sum;
    }
}







//Optimal Code

class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum = 0;

        int[] pse = new int[n];
        int[] nse = new int[n];
        int[] pge = new int[n];
        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        //  previous smaller elements
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();

        // nearest smaller elements
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

        // previous greater elements
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();

        //  nearest greater elements
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        long minSum = 0, maxSum = 0;

        for (int i = 0; i < n; i++) {
            long leftmin = i - pse[i];
            long rightmin = nse[i] - i;
            minSum += (long) nums[i] * leftmin * rightmin;

            long leftmax = i - pge[i];
            long rightmax = nge[i] - i;
            maxSum += (long) nums[i] * leftmax * rightmax;
        }
        return maxSum - minSum;
    }
}
