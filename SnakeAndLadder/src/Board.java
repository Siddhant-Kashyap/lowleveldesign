import java.util.HashMap;

public class Board {
    String boardId;
    Cell [] cells;
    HashMap<Integer,Integer> snakeMap;
    HashMap<Integer,Integer> ladderMap;

    public Board(String boardId) {
        this.boardId = boardId;
        this.cells = new Cell[100];
        this.snakeMap = new HashMap<>();
        this.ladderMap = new HashMap<>();
    }
    public void initCells(){
        for (int i = 0; i <cells.length ; i++) {
            cells[i] = new Cell(i,i);
        }
    }
    public void putSnakes(){
        snakeMap.put(98,1);
        snakeMap.put(91,43);
        snakeMap.put(43,11);
        snakeMap.put(77,34);
    }
    public void putLadder(){
        ladderMap.put(10,33);
        ladderMap.put(33,87);
        ladderMap.put(24,58);
        ladderMap.put(9,90);
    }
   
}
