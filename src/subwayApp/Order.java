package subwayApp;

import java.util.List;

public class Order {

    private final int price;
    private final Sub sub;
    private Drink drink;
    private Cookie cookie;

    public Order() {
        this.sub = new Sub();
        this.price = 15000;
    }

    public Order(Sub sub) {
        this.sub = sub;
        this.price = 15000;
    }

    public Order(Sub sub, Drink drink, Cookie cookie) {
        this.sub = sub;
        this.drink = drink;
        this.cookie = cookie;
        this.price = 22000;
    }

    public String getOrder() {

        if (drink != null && cookie != null) {
            return "Order: \n" +
                    "\tSub:\n" +
                    "\t" + sub.getSubIngredients().getIngredients() + "\n" +
                    "\tDrink: " + drink.getDrink() + "\n" +
                    "\tCookie: " + cookie.getCookieFlavor() + "\n" +
                    "Order Price: " + this.price;
        }

        return "Order: \n" +
                "\tSub:\n" +
                "\t" + sub.getSubIngredients().getIngredients() + "\n" +
                "Order Price: " + this.price;
    }

}
