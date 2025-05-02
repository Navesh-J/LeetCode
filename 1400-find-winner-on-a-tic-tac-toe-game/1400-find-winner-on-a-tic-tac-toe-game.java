class Solution {
    public String tictactoe(int[][] moves) {
        String board[][]=new String[3][3];
        for(int i=0;i<moves.length;i++){
            int row=moves[i][0],col=moves[i][1];
            board[row][col]=(i%2==0)?"X":"O";
        }
        String[] players = {"X","O"};
        for(String player:players){
            for(int i=0;i<3;i++){
                if (player.equals(board[i][0]) && player.equals(board[i][1]) && player.equals(board[i][2]))
                    return player.equals("X") ? "A" : "B";
                if (player.equals(board[0][i]) && player.equals(board[1][i]) && player.equals(board[2][i]))
                    return player.equals("X") ? "A" : "B";
            }
            if (player.equals(board[0][0]) && player.equals(board[1][1]) && player.equals(board[2][2])) {
                return player.equals("X") ? "A" : "B";
            }
            if (player.equals(board[0][2]) && player.equals(board[1][1]) && player.equals(board[2][0])) {
                return player.equals("X") ? "A" : "B";
            }
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}