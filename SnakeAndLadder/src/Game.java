import java.util.ArrayList;
import java.util.List;

public class Game {
    String gameId;
    List<Player> players;
    Board board;
    Dice dice ;

    public Game(String gameId) {
        this.gameId = gameId;
        this.players = new ArrayList<>();
        this.board = new Board("1234");
        this.dice = new Dice(12345);
        board.initCells();
        board.putLadder();
        board.putSnakes();
    }

    public void makeMove(Player player ){
        int pos = dice.roll();
        System.out.println("Player: "+player.getName()+ "===> is playing the move");
        int oldPos = player.getPosition();
        int newPos = pos+oldPos;
        player.setPosition(newPos);
        if(board.snakeMap.get(newPos)!= null){
            player.setPosition(board.snakeMap.get(newPos));
            System.out.println("Snake Encountered !!! Penalty !!");
        }
        if(board.ladderMap.get(newPos) != null){
            player.setPosition(board.ladderMap.get(newPos));
            System.out.println("Ladder Encounter !!! Rewarded");
        }
        if(player.getPosition()== board.cells.length) {
            player.setWinner(true);
            System.out.println("***********  "+player.getName() + " is Winner ************");
            return;
        }
        if(player.getPosition()>100){
            player.setPosition(oldPos);
        }

        System.out.println("New position of player is "+ player.getPosition());

    }
}
