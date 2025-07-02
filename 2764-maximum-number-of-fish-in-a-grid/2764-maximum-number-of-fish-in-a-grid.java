class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && !visited[i][j]) {
                    int fishCount = dfs(grid, visited, i, j);
                    maxFish = Math.max(maxFish, fishCount);
                }
            }
        }
        
        return maxFish;
    }
    
    private int dfs(int[][] grid, boolean[][] visited, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        
        visited[i][j] = true;
        
        int sum = grid[i][j];
        sum += dfs(grid, visited, i + 1, j);
        sum += dfs(grid, visited, i - 1, j);
        sum += dfs(grid, visited, i, j + 1);
        sum += dfs(grid, visited, i, j - 1);
        
        return sum;
    }
}
