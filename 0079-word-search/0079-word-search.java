class Solution {
    private Set<String> visited;
    private int rows;
    private int col;
    public boolean exist(char[][] board, String word) {
        rows = board.length;
        visited = new HashSet<>();
        col = board[0].length;

        Map<Character, Integer> sum = new HashMap<>();
        for (char c : word.toCharArray()) {
            sum.put(c, sum.getOrDefault(c, 0) + 1);
        }

        if (sum.getOrDefault(word.charAt(0), 0) > sum.getOrDefault(word.charAt(word.length() - 1), 0)) {
            word = new StringBuilder(word).reverse().toString();
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < col; c++) {
                if (solve(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean solve(char[][] board, String word, int r, int c, int k) {
        if (k == word.length()) {
            return true;
        }

        if (r < 0 || r >= rows || c < 0 || c >= col || visited.contains(r + "," + c) || board[r][c] != word.charAt(k)) {
            return false;
        }

        visited.add(r + "," + c);
        boolean res = solve(board, word, r + 1, c, k + 1) ||
                      solve(board, word, r - 1, c, k + 1) ||
                      solve(board, word, r, c + 1, k + 1) ||
                      solve(board, word, r, c - 1, k + 1);
        visited.remove(r + "," + c);
        return res;
    }    
}