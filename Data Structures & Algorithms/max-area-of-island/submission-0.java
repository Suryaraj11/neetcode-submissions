class Solution {
    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int maxLand = 0;
        for(int i =0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    maxLand = Math.max(maxLand,dfs(grid,i,j));
                }
            }
        }
        return maxLand;
    }

    public int dfs(int[][] grid, int i, int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0)return 0;
        System.out.println(" i:"+i+" j:"+j);
        grid[i][j]=0;
        int res = 1;
        for(int[] dir : directions)
        {
            res += dfs(grid,i+dir[0],j+dir[1]);
        }
        return res;
    }
}
