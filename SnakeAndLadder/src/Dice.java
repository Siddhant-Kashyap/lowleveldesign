import java.util.Random;

public class Dice {
    private int id ;
    Random random;

    public Dice(int id) {
        this.id = id;
         random = new Random();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int roll(){
        return random.nextInt(6)+1;
    }
}
