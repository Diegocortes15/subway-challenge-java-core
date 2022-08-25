package subwayApp;

import java.util.List;

public class Order {

    private final Sub sub;
    private Drink drink;
    private Cookie cookie;
    private final Receipt receipt;

    public Order() {
        this.sub = new Sub();
        this.cookie = new Cookie();
        this.drink = new Drink();
        this.receipt = new Receipt(this);
    }

    public Order(Sub sub) {
        this.sub = sub;
        this.cookie = new Cookie();
        this.drink = new Drink();
        this.receipt = new Receipt(this);
    }

    public Order(Sub sub, Drink drink, Cookie cookie) {
        this.sub = sub;
        this.drink = drink;
        this.cookie = cookie;
        this.receipt = new Receipt(this);
    }

    public Sub getSub() {
        return sub;
    }

    public Drink getDrink() {
        return drink;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    /*public String getOrder() {

        if (drink != null && cookie != null) {
            return "Order: \n" +
                    "\tSub:\n" +
                    "\t" + sub.getSubIngredients().getIngredients() + "\n" +
                    "\tDrink: " + drink.getDrink() + "\n" +
                    "\tCookie: " + cookie.getCookieFlavor() + "\n";
        }

        return "Order: \n" +
                "\tSub:\n" +
                "\t" + sub.getSubIngredients().getIngredients() + "\n";
    }*/
}
