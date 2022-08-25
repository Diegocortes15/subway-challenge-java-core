package subwayApp;

public class Additions {
    private String addition;
    private int additionPrice;

    public Additions() {
        this.addition = "None";
        this.additionPrice = 0;
    }

    public Additions(String addition) {
        this.addition = addition;
        this.additionPrice = 1500;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
        this.additionPrice = 1500;
    }

    public int getAdditionPrice(){
        return additionPrice;
    }
}
