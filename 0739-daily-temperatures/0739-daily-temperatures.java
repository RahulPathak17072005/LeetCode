class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n=nums.length;
        int[] ll=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while (!st.isEmpty() && nums[i] > nums[st.peek()]) {
                int prevIndex = st.pop();
                ll[prevIndex] = i - prevIndex; 
            }
            st.push(i); 
        }

        return ll;
    }
}