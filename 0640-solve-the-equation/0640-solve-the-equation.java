class Solution {
    public String solveEquation(String equation) {
        String[] parts = equation.split("=");
        int[] left = parse(parts[0]);
        int[] right = parse(parts[1]);

        int coef = left[0] - right[0];    
        int consts = right[1] - left[1];   

        if (coef == 0) return consts == 0 ? "Infinite solutions" : "No solution";
        return "x=" + (consts / coef);
    }

    private int[] parse(String expr) {
        expr = expr.replace("-", "+-");
        String[] tokens = expr.split("\\+");
        int coef = 0, consts = 0;

        for (String t : tokens) {
            if (t.isEmpty()) continue;
            if (t.equals("x")) coef++;
            else if (t.equals("-x")) coef--;
            else if (t.contains("x")) coef += Integer.parseInt(t.replace("x", ""));
            else consts += Integer.parseInt(t);
        }
        return new int[]{coef, consts};
    }
}
