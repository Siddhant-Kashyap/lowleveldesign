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
            //get the current player
            //take input for row and col
            //check validity of move and if valid place it on board
            //check winner
            //add the plater to back of queue
        }
    }
}
