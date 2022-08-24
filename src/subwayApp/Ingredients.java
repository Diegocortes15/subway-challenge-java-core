package subwayApp;

public class Ingredients {

    private final String bread;
    private final String fillings;
    private final String cheeses;
    private final String veggies;
    private final String sauces;
    private final String whether;

    public Ingredients() {
        this.bread = "Oregano";
        this.fillings = "BBQ Meat";
        this.cheeses = "American";
        this.veggies = "Lettuce, tomato and pickles";
        this.sauces = "Ranch and BBQ";
        this.whether = "Toasted";
    }

    public Ingredients(String breads, String fillings, String cheeses, String veggies, String sauces, String whether) {
        this.bread = breads;
        this.fillings = fillings;
        this.cheeses = cheeses;
        this.veggies = veggies;
        this.sauces = sauces;
        this.whether = whether;
    }

    public String getIngredients() {
        return "Ingredients: \n" +
                "\t Bread: " +  bread + "\n" +
                "\t Fillings: " + fillings + "\n" +
                "\t Cheeses: " + cheeses + "\n" +
                "\t Veggies: " + veggies + "\n" +
                "\t Sauces: " + sauces + "\n" +
                "\t Whether: " + whether;
    }
}
