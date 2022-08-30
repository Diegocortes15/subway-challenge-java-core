package subwayapp;

public class Drink {

    private int drinkPrice;
    private String drinkType;
    private String drinkFlavor;

    public Drink() {
        this.drinkType = "None";
        this.drinkFlavor = "None";
        this.drinkPrice = 0;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
        setDrinkPrice(3500);
    }

    public void setDrinkFlavor(String drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
        setDrinkPrice(3500);
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public String getDrinkFlavor() {
        return drinkFlavor;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }
}
