package subwayapp;

public class Sub {

    private final int subPrice;
    private final Ingredients ingredients;
    private final Additions additions;

    public Sub() {
        this.ingredients = new Ingredients();
        this.additions = new Additions();
        this.subPrice = 15000;
    }

    public Sub(Ingredients ingredients) {
        this.ingredients = ingredients;
        this.additions = new Additions();
        this.subPrice = 15000;
    }

    public Sub(Ingredients ingredients, Additions additions) {
        this.ingredients = ingredients;
        this.additions = additions;
        this.subPrice = 15000;
    }

    public Ingredients getSubIngredients() {
        return ingredients;
    }

    public Additions getSubAdditions() {
        return additions;
    }

    public int getSubPrice() {
        return subPrice;
    }
}
