public abstract class AbstractPaper {
    private String name;

    public AbstractPaper(String name){
        this.name = name;
    }

    public abstract void get();

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
