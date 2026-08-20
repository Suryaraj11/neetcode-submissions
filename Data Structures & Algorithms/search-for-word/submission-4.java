class Solution {
    int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j = 0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    boolean exist = false;
                    exist = dfs(board,word,i,j,0, new boolean[board.length][board[i].length]);
                    if(exist)return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] visited)
    {
        
        if(i<0 || i>= board.length || j<0 || j>=board[i].length || visited[i][j] || index>word.length())return false;
       // System.out.println(" char:"+board[i][j]+" letter:"+word.charAt(index)+" index:"+index);
        if((index==word.length()-1) && (board[i][j]==word.charAt(index)))return true;
        boolean exist = false;
        if(board[i][j]==word.charAt(index))
        {
            visited[i][j] = true;
            for(int[] dir : directions)
            {
                exist = dfs(board,word,i+dir[0],j+dir[1],index+1,visited);
                if(exist)return exist;
            }
        }
        visited[i][j] = false;
        return exist;
    }
}
