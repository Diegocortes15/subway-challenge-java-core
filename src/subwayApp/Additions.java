package subwayApp;

public class Additions {
    private String addition;
    private int additionPrice;

    public Additions() {
        this.addition = "None";
        this.additionPrice = 0;
    }

    public void setAddition(String addition) {
        this.addition = addition;
        setAdditionPrice(1500);
    }

    public void setAdditionPrice(int additionPrice) {
        this.additionPrice = additionPrice;
    }

    public int getAdditionPrice(){
        return additionPrice;
    }

    public String getAddition() {
        return addition;
    }
}
