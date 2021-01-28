public class Smartphone implements Ringable{

    private String name;

    public Smartphone(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Smartphone(String name) {
        this.name = name;
    }

    @Override
    public void ring() {
        System.out.println("Zayn: Zing-zing. Who the fuck is calling? (UNKNOWN NUMBER...) ");
    }

    @Override
    public void get() {
        System.out.println("Killer: We will kill your girlfriend if you don't bring money!");
    }
}
