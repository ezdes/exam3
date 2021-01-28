public class RightPocket {
    private AbstractPaper paper;

    public RightPocket(){}

    public RightPocket(AbstractPaper paper) {
        this.paper = paper;
    }

    public AbstractPaper getPaper() {
        return paper;
    }

    public void setPaper(AbstractPaper paper) {
        this.paper = paper;
    }
}
