// Hard
//  Previous Sum Elements for left Boundary.
//  Nearest Sum Elements for right Boundary.




// Brute force

class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int max = 0;

        int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, heights[i] * (nse[i] - pse[i] - 1));
        }
        return max;
    }
}



// Optimise Code
