class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        //run through every row and put char appearances in set
        for(int x = 0; x<board.length; x++){
            set.clear();
            for(int y = 0; y < board[0].length; y++){
                if(board[x][y] == '.')
                    continue;
                if(set.contains(board[x][y]))
                    return false;
                else
                    set.add(board[x][y]);
            }
        }

        //run through every column and put char appearances in set
        for(int y = 0; y<board.length; y++){
            set.clear();
            for(int x = 0; x < board[0].length; x++){
                if(board[x][y] == '.')
                    continue;
                if(set.contains(board[x][y]))
                    return false;
                else
                    set.add(board[x][y]);
            }
        }
        
        //check 3x3 grids
        for(int x = 0; x < 9; x+=3){
            for(int y = 0; y < 9; y+=3){
                set.clear();

                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){

                        if(board[i+x][j+y] == '.')
                            continue;
                        if(set.contains(board[i+x][j+y]))
                            return false;
                        else
                            set.add(board[i+x][j+y]);
                    }
                }
            }
        }

        return true;
    }
}
