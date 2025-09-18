class Solution {
    List<String> res = new ArrayList<>();

    public boolean valid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (stack.isEmpty())
                    return false;
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public void helper(int n, String str) {
        if (n == 0) {
            if (valid(str)) {
                res.add(str);
            }
            return;
        }
        helper(n - 1, str + '(');
        helper(n - 1, str + ')');
    }

    public List<String> generateParenthesis(int n) {
        helper(n * 2, "");
        return res;
    }
}