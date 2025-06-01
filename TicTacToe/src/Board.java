public class Board {
    private final  int size;
    private final Peice[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Peice[size][size];

    }
    //placePeice
    public boolean placePeice(int row,int col,Peice peice){
        if(row<0 ||col<0|| row>=size||col>=size || board[row][col] != null){
            return false;
        }
        board[row][col] = peice;
        return true;
    }

    //checkWinner
    public boolean checkWinner(int row,int col, Peice peice){
        PeiceType type = peice.getType();
        // check Horizontal
        boolean win =true;
        for(int i=0;i<size;i++){
            if(board[row][i] == null ||board[row][i].getType() != type){
                win= false;
                break;
            }
        }
        if(win)return true;
        win = true;
        for(int i=0;i<size;i++){
            if(board[i][col] == null || board[i][col].getType() != type){
                win = false;
            }
        }
        if(win) return true;
        win = true;
        if (row == col) {
            win = true;
            for (int i = 0; i < size; i++) {
                if (board[i][col] == null || board[i][col].getType() != type) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check Anti-Diagonal
        if (row + col == size - 1) {
            win = true;
            for (int i = 0; i < size; i++) {
                if (board[i][size - i - 1] == null || board[i][size - i - 1].getType() != type) {
                    win = false;
                    break;
                }
            }
            return win;
        }

        return false;
    }

    //printBoard
    public void printBoard(){
        for(Peice[] row: board){
            for (Peice cell: row){
                System.out.print(cell==null?"_":cell.getType());
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
    //isFull
    public boolean isFull(){
        for(Peice[] row: board){
            for (Peice cell: row){
            if(cell == null) return false;
            }

        }
        return true;
    }

}
