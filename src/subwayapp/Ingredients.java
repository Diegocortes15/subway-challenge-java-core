package subwayapp;

public class Ingredients {

    private String bread;
    private String fillings;
    private String cheeses;
    private String veggies;
    private String sauces;
    private String whether;

    public Ingredients() {
        this.bread = "Oregano";
        this.fillings = "BBQ Meat";
        this.cheeses = "American";
        this.veggies = "Lettuce, tomato and pickles";
        this.sauces = "Ranch and BBQ";
        this.whether = "Toasted";
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setFillings(String fillings) {
        this.fillings = fillings;
    }

    public void setCheeses(String cheeses) {
        this.cheeses = cheeses;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public void setWhether(String whether) {
        this.whether = whether;
    }

    public String getIngredients() {
        return String.format("""
                Bread: %s
                Fillings: %s
                Cheeses: %s
                Veggies: %s
                Sauces: %s
                Whether: %s""", bread, fillings, cheeses, veggies, sauces, whether);
    }
}
