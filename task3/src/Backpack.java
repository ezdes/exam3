import java.util.ArrayList;

public class Backpack {
    private ArrayList<Round> round = new ArrayList<>();
    private Flat flat;
    private Cylindrical cylindrical;

    public Backpack(){}


    public Backpack(ArrayList<Round> round, Flat flat, Cylindrical cylindrical) {
        this.round = round;
        this.flat = flat;
        this.cylindrical = cylindrical;
    }

    public ArrayList<Round> getRound() {
        return round;
    }

    public void setRound(ArrayList<Round> round) {
        this.round = round;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public Cylindrical getCylindrical() {
        return cylindrical;
    }

    public void setCylindrical(Cylindrical cylindrical) {
        this.cylindrical = cylindrical;
    }
}
