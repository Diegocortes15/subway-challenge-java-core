package subwayApp;

public class Cookie {

    private final String cookieFlavor;

    public Cookie() {
        this.cookieFlavor = "Chocolate";
    }

    public Cookie(String flavor) {
        this.cookieFlavor = flavor;
    }

    public String getCookieFlavor() {
        return cookieFlavor;
    }
}
