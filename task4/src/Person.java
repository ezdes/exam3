public class Person {
    private String name;
    private LeftPocket lp;
    private RightPocket rp;

    public Person(){

    }

    public Person(String name, LeftPocket lp, RightPocket rp) {
        this.name = name;
        this.lp = lp;
        this.rp = rp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LeftPocket getLp() {
        return lp;
    }

    public void setLp(LeftPocket lp) {
        this.lp = lp;
    }

    public RightPocket getRp() {
        return rp;
    }

    public void setRp(RightPocket rp) {
        this.rp = rp;
    }
}
