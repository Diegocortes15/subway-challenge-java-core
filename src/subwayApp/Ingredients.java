package subwayApp;

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

    public Ingredients(String breads, String fillings, String cheeses, String veggies, String sauces, String whether) {
        this.bread = breads;
        this.fillings = fillings;
        this.cheeses = cheeses;
        this.veggies = veggies;
        this.sauces = sauces;
        this.whether = whether;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getFillings() {
        return fillings;
    }

    public void setFillings(String fillings) {
        this.fillings = fillings;
    }

    public String getCheeses() {
        return cheeses;
    }

    public void setCheeses(String cheeses) {
        this.cheeses = cheeses;
    }

    public String getVeggies() {
        return veggies;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getWhether() {
        return whether;
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
