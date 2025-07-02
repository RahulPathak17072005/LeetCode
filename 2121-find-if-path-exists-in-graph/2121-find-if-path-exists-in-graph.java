class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());//arrayList define/initialized  kr do bhai
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);//graph bna do
        }
        //hahah
        boolean[] visited = new boolean[n];
        return dfs(adj, source, destination, visited);
    }

    private boolean dfs(List<List<Integer>> adj, int current, int destination, boolean[] visited) {
        if (current == destination)
            return true;

        visited[current] = true;

        for (int neighbor : adj.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(adj, neighbor, destination, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}