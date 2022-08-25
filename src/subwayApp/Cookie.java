package subwayApp;

public class Cookie {

    private final int cookiePrice;
    private final String cookieFlavor;

    public Cookie() {
        this.cookieFlavor = "None";
        this.cookiePrice = 0;
    }

    public Cookie(String flavor) {
        this.cookieFlavor = flavor;
        this.cookiePrice = 3500;
    }

    public String getCookieFlavor() {
        return cookieFlavor;
    }

    public int getCookiePrice() {
        return cookiePrice;
    }
}
