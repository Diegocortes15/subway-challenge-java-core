package subwayapp;

public class Cookie {

    private int cookiePrice;
    private String cookieFlavor;

    public Cookie() {
        this.cookieFlavor = "None";
        this.cookiePrice = 0;
    }

    public void setCookieFlavor(String cookieFlavor) {
        this.cookieFlavor = cookieFlavor;
        setCookiePrice(3500);
    }

    public void setCookiePrice(int cookiePrice) {
        this.cookiePrice = cookiePrice;
    }

    public String getCookieFlavor() {
        return cookieFlavor;
    }

    public int getCookiePrice() {
        return cookiePrice;
    }
}
