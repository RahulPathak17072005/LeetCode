class Solution {
    public int largestRectangleArea(int[] heights) {
        int h=heights.length;
        Stack<Integer> st=new Stack<>();
        int area=0;
        for(int i=0;i<h;i++){
            while (!st.empty() && heights[i] < heights[st.peek()]) {
                int b = st.pop();
                int p = st.empty() ? -1 : st.peek(); 
                int n = i;
                area = Math.max(area, heights[b] * (n - p - 1));
            }
             st.push(i);
        }
            while (!st.empty()) {
            int b = st.pop();
            int p = st.empty() ? -1 : st.peek();
            int n = h;
            area = Math.max(area, heights[b] * (n - p - 1));
        }

        return area;
    }
}