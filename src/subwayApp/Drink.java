package subwayApp;

public class Drink {

    private int drinkPrice;
    private String drinkType;
    private String drinkFlavor;

    public Drink() {
        this.drinkType = "None";
        this.drinkFlavor = "None";
        this.drinkPrice = 0;
    }

    public Drink(String drinkType, String drinkFlavor) {
        this.drinkType = drinkType;
        this.drinkFlavor = drinkFlavor;
        this.drinkPrice = 3500;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
        this.drinkPrice = 3500;
    }

    public void setDrinkFlavor(String drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
        this.drinkPrice = 3500;
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
