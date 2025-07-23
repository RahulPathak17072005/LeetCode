class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return countGain(s, 'a', 'b', x) + countGainRemaining(s, 'b', 'a', y);
        } else {
            return countGain(s, 'b', 'a', y) + countGainRemaining(s, 'a', 'b', x);
        }
    }
    private int countGain(String s, char first, char second, int val) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        StringBuilder temp = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == first && c == second) {
                st.pop();
                count += val;
            } else {
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            temp.append(st.pop());
        }
        remaining = temp.reverse().toString(); 
        return count;
    }
    private String remaining = "";
    private int countGainRemaining(String dummy, char first, char second, int val) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char c : remaining.toCharArray()) {
            if (!st.isEmpty() && st.peek() == first && c == second) {
                st.pop();
                count += val;
            } else {
                st.push(c);
            }
        }
        return count;
    }
}
