class Algo1_day9_1 {
    
    
public int[][] updateMatrix(int[][] matrix) {
        int m  = matrix.length;
        int n = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
                 
            }
        }
        int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int[] cell : dirs) {
                int r = cur[0] + cell[0];
                int c = cur[1] + cell[1];
             
                if (r < 0 || r >= m || c < 0 || c >= n || matrix[r][c] <= matrix[cur[0]][cur[1]] + 1) {
                    continue;
                }
                matrix[r][c] = matrix[cur[0]][cur[1]] + 1;
                queue.offer(new int[]{r,c});
            }
        }
        return matrix;
    }
}
