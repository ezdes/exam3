import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Round> round1 = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            round1.add(new Apple("Apple"));
        }

        Backpack backpack1 = new Backpack(round1, new Flat("Book"), new CocaCola("Cola"));

        System.out.println(backpack1.getFlat() + " " + backpack1.getRound() + " " + backpack1.getCylindrical());

        //----------------------------------------------------------------------------------------------------------------------

        ArrayList<Round> round2 = new ArrayList<>();

        for (int i = 0; i < 50; i++){
            round2.add(new Ball("Ball"));
        }

        Backpack backpack2 = new Backpack(round2, new Flat("Folder"), new Water("Water"));

        System.out.println(backpack2.getFlat() + " " + backpack2.getRound() + " " + backpack2.getCylindrical());

        //----------------------------------------------------------------------------------------------------------------------

        ArrayList<Round> round3 = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            round3.add(new Apple("Apple"));
        }

        round3.add(new Ball("Ball"));
        round3.add(new Ball("Ball"));
        round3.add(new Ball("Ball"));

        Backpack backpack3 = new Backpack(round3, new Flat("Folder"), new CocaCola("Cola"));

        System.out.println(backpack3.getFlat() + " " + backpack3.getRound() + " " + backpack3.getCylindrical());
    }
}
