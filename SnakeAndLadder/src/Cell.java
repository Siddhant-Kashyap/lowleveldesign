public class Cell {
    private int cellId;
    private  int position;

    public Cell(int cellId ,int position) {
        this.cellId = cellId;
        this.position = position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
