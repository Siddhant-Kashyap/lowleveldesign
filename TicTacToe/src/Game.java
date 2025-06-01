import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private Board board;
    private Deque<Player> players;

    public Game(int size,Player player1, Player player2) {
        this.board = new Board(size);
        this.players = new LinkedList<>();
        players.add(player1);
        players.add(player2);
    }



    public void start(){
        Scanner sc = new Scanner(System.in);

        while(true){
            //printboard
            board.printBoard();

            //get the current player
            Player currentPlayer= players.pollFirst();
            System.out.println(currentPlayer.getName()+"'s Chance to play.");
            System.out.println("Please Enter row or column to place the your piece");
            //take input for row and col
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(!board.placePeice(row,col,currentPlayer.getPeice())){
                System.out.println("Invalid move");
                players.addFirst(currentPlayer);
                continue;
            }
            //check Winner
            if(board.checkWinner(row,col,currentPlayer.getPeice())){
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }


            if(board.isFull()){
                System.out.println("Its a draw");
                board.printBoard();
                break;
            }
            players.addLast(currentPlayer);
        }
        sc.close();
    }
}
