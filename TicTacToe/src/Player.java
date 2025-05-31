public class Player {
    private int id;
    private String name;
    private Peice peice;

    public Player(int id, String name, Peice peice) {
        this.id = id;
        this.name = name;
        this.peice = peice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Peice getPeice() {
        return peice;
    }

    public void setPeice(Peice peice) {
        this.peice = peice;
    }
}
