package subwayApp;

public class Additions {
    private String addition;
    private final int additionPrice;

    public Additions() {
        this.additionPrice = 0;
    }

    public Additions(String addition) {
        this.addition = addition;
        additionPrice = 1500;
    }

    public String getAddition() {
        return addition;
    }

    public int getAdditionPrice(){
        return additionPrice;
    }
}
