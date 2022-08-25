package subwayApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {

    private final Order order;
    private final int total;
    private String date;
    private long id;

    public Receipt(Order order) {
//        this.orderDetails = order.getOrder();
        this.order = order;
        this.total =
                order.getSub().getSubPrice() +
                        order.getSub().getSubAdditions().getAdditionPrice() +
                        order.getCookie().getCookiePrice() +
                        order.getDrink().getDrinkPrice();
        setDate();
        setId();
    }

    private void setDate() {
        LocalDateTime instance = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");
        this.date = formatter.format(instance);
    }

    private void setId() {
        this.id = System.currentTimeMillis();
    }

    public String getReceipt() {
        return String.format("""
                ==========================================
                RECEIPT #%s
                -------------------------------------
                SubWay      %s
                -------------------------------------
                ITEM
                Sub _______________________ $%s
                Ingredients:
                %s
                
                Additions _________________ $%s
                Addition: %s
                
                Drink _____________________ $%s
                Drink type: %s
                Drink flavor: %s
                
                Cookie ____________________ $%s
                Cookie flavor: %s
                
                -------------------------------------
                TOTAL $%s
                ==========================================""",
                id,
                date,
                order.getSub().getSubPrice(),
                order.getSub().getSubIngredients().getIngredients(),
                order.getSub().getSubAdditions().getAdditionPrice(),
                order.getSub().getSubAdditions().getAddition(),
                order.getDrink().getDrinkPrice(),
                order.getDrink().getDrinkType(),
                order.getDrink().getDrinkFlavor(),
                order.getCookie().getCookiePrice(),
                order.getCookie().getCookieFlavor(),
                total);
    }
}
