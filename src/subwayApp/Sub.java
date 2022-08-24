package subwayApp;

public class Sub {

    private final Ingredients ingredients;
    private Additions additions;

    public Sub(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Sub(Ingredients ingredients, Additions additions) {
        this.ingredients = ingredients;
        this.additions = additions;
    }

    public Ingredients getSubIngredients() {
        return ingredients;
    }

    public Additions getSubAdditions() {
        return additions;
    }
}
