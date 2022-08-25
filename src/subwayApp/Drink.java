package subwayApp;

public class Drink {

    private final int drinkPrice;
    private final String drinkType;
    private final String drinkFlavor;

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
