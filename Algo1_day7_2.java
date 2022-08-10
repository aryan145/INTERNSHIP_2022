class Algo1_day7_2 {
    
    public int coverIsland(int[][] grid, int i, int j,int[][] visited){
            
        if(i<0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;
        
        if(visited[i][j] == 1)return 0;
        
        visited[i][j] = 1;
        
          return( 1 + coverIsland(grid,i,j-1,visited)+
                    coverIsland(grid,i-1,j,visited)+
                    coverIsland(grid,i,j+1,visited)+
                    coverIsland(grid,i+1,j,visited) 
                 );

    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && visited[i][j] == 0)
                    maxArea = Math.max(maxArea,coverIsland(grid,i,j,visited));
            }
        }
        
        return maxArea;
    }
}
