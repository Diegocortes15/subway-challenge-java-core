package subwayApp;

public class Drink {

    private final String drinkType;
    private final String drinkFlavor;

    public Drink() {
        this.drinkType = "Glass";
        this.drinkFlavor = "Pepsi";
    }

    public Drink(String drinkType, String drinkFlavor) {
        this.drinkType = drinkType;
        this.drinkFlavor = drinkFlavor;
    }


    public String getDrink() {
        return "Type: " + this.drinkType + "\n" +
                "Flavor: " + this.drinkFlavor;
    }


}
