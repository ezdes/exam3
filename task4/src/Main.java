import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Money money = new Money("Dollar");
        Smartphone smartphone = new Smartphone("Google Pixel");

        LeftPocket leftPocket = new LeftPocket(smartphone);
        RightPocket rightPocket = new RightPocket(money);

        Person person = new Person("Zayn", leftPocket, rightPocket);

        person.getLp().getRingable().ring();
        TimeUnit.SECONDS.sleep(5);

        person.getLp().getRingable().get();
        TimeUnit.SECONDS.sleep(5);

        System.out.println("Zayn: I need to give them money...(looking for money in right pocket)");
        TimeUnit.SECONDS.sleep(5);

        person.getRp().getPaper().get();
        TimeUnit.SECONDS.sleep(5);

        System.out.println("Gigi: Ohh darling thank you for saving my life (Crying...)");

        System.out.println("Happy End!!!");
    }
}
