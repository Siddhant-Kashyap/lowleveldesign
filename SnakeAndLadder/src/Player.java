public class Player {
    private String id;
    private String name;
    private int position;
    private boolean isWinner;

    public Player(String id, String name, int position) {
        this.id = id;
        this.name = name;
        this.position = -1;
        this.isWinner = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}
