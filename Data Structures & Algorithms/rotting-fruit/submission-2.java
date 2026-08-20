class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList();
        int fresh=0,minutes=-1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)q.offer(new int[]{i,j});
                if(grid[i][j]==1)fresh++;
            }
        }
        if(q.isEmpty() && fresh==0)return 0;
        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- >0)
            {
                int[] pos = q.poll();
                for(int[] dir : directions)
                {
                    int x = pos[0] + dir[0];
                    int y = pos[1] + dir[1];
                    if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==1)
                    {
                        grid[x][y]=2;
                        q.offer(new int[]{x,y});
                        fresh--;
                    }
                }
            }
            minutes++;
        }
        if(fresh==0)return minutes;
        return -1;
    }
}
