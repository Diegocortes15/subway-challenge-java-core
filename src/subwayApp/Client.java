package subwayApp;

public class Client {

    public static void main(String[] args) {

        Sub sub = new Sub(new Ingredients(
                "oregano",
                "BBQ Meat",
                "American",
                "Lettuce, tomato and pickles",
                "Ranch and BBQ",
                "Toasted"));

        System.out.println(sub.getSubIngredients().getIngredients());
    }
}