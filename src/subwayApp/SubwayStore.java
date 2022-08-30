package subwayApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubwayStore {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    private final Ingredients ingredients;
    private final Additions additions;
    private final Drink drink;
    private final Cookie cookie;

    private int numberOption;

    public SubwayStore() {
        this.ingredients = new Ingredients();
        this.additions = new Additions();
        this.drink = new Drink();
        this.cookie = new Cookie();
    }

    public static void clearBackSpace() {
        System.out.println("\b");
    }

    private void menuSubwayType() {
        try {
            clearBackSpace();
            System.out.println("*** Welcome to Subway! ***");
            System.out.println("0. Do not order");
            System.out.println("1. Would you like chose our default menu?");
            System.out.println("2. Would you want chose your sub ingredients?");
            this.numberOption = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void breadMenu() {
        try {
            clearBackSpace();
            System.out.println("What bread would you like?");
            System.out.println("* White");
            System.out.println("* Integral");
            System.out.println("* Oatmeal and Honey");
            System.out.println("* Oregano Parmesan");
            System.out.println("* Ajo Roast");
            System.out.println("Type the bread you want:");
            ingredients.setBread(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cheeseMenu() {
        try {
            clearBackSpace();
            System.out.println("What cheese would you like?");
            System.out.println("* American");
            System.out.println("* Provolone");
            System.out.println("* Mozzarella");
            System.out.println("Type the cheeses you want:");
            ingredients.setCheeses(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fillingsMenu() {
        try {
            clearBackSpace();
            System.out.println("What fillings would you like?");
            System.out.println("* Chicken");
            System.out.println("* Salami");
            System.out.println("* Poultry breast");
            System.out.println("* Meat BBQ");
            System.out.println("* Turkey and Ham");
            System.out.println("* Tuna");
            System.out.println("Type the cheeses you want:");
            ingredients.setFillings(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void weatherMenu() {
        try {
            clearBackSpace();
            System.out.println("How would you like your sandwich?");
            System.out.println("* Cold");
            System.out.println("* Toasted");
            System.out.println("Type how you want your sandwich:");
            ingredients.setWhether(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void vegetablesMenu() {
        try {
            clearBackSpace();
            System.out.println("What vegetables would you like?");
            System.out.println("* Lettuce");
            System.out.println("* Tomato");
            System.out.println("* Cucumber");
            System.out.println("* Onion");
            System.out.println("* Peppers");
            System.out.println("* Olives");
            System.out.println("Type the vegetables you want:");
            ingredients.setVeggies(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saucesMenu() {
        try {
            clearBackSpace();
            System.out.println("What sauces would you like?");
            System.out.println("* Mustard");
            System.out.println("* Sweet Mustard");
            System.out.println("* Mayonnaise");
            System.out.println("* Vinaigrette");
            System.out.println("* Sweet Onion");
            System.out.println("* Ranch");
            System.out.println("* BBQ");
            System.out.println("Type the sauces you want:");
            ingredients.setSauces(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void haveAdditions() {
        try {
            clearBackSpace();
            System.out.println("Would you like add additions?");
            System.out.println("0. Cancel order");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println("Chose one option please:");
            numberOption = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addAdditions() {
        try {
            clearBackSpace();
            System.out.println("What addition would you like to do?");
            System.out.println("Type the addition you would like:");
            additions.setAddition(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void drinkTypeMenu() {
        try {
            clearBackSpace();
            System.out.println("How do you want your drink?");
            System.out.println("* Bottle");
            System.out.println("* Cup");
            System.out.println("Type how do you want your drink:");
            drink.setDrinkType(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void drinkFlavorMenu() {
        try {
            clearBackSpace();
            System.out.println("What drink flavor would you like?");
            System.out.println("* Pepsi");
            System.out.println("* 7Up");
            System.out.println("* Uva");
            System.out.println("* Mr.Tea");
            System.out.println("Type flavor do you want to drink:");
            drink.setDrinkFlavor(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cookieFlavorMenu() {
        try {
            clearBackSpace();
            System.out.println("What cookie flavor would you like?");
            System.out.println("* Chocolate");
            System.out.println("* Vanilla");
            System.out.println("Type cookie do you want to eat:");
            cookie.setCookieFlavor(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void isCombo() {
        try {
            clearBackSpace();
            System.out.println("Would you like your sandwich in combo?");
            System.out.println("0. Cancel order");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println("Chose one option please:");
            numberOption = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void serveFullMenu(){
        clearBackSpace();
        Order order = new Order(new Sub(ingredients, additions), drink, cookie);
        System.out.println(order.getReceipt().printReceipt());
    }

    private void serveComboMenu(){
        clearBackSpace();
        Order order = new Order(new Sub(ingredients), drink, cookie);
        System.out.println(order.getReceipt().printReceipt());
    }

    private void serveAdditionsMenu(){
        clearBackSpace();
        Order order = new Order(new Sub(ingredients, additions));
        System.out.println(order.getReceipt().printReceipt());
    }

    private void serveNormalMenu(){
        clearBackSpace();
        Order order = new Order(new Sub(ingredients));
        System.out.println(order.getReceipt().printReceipt());
    }

    private void serveDefaultMenu(){
        clearBackSpace();
        Order order = new Order();
        System.out.println(order.getReceipt().printReceipt());
    }

    public void orderMenu() {

        do {
            menuSubwayType();

            if (numberOption == 1) {
                serveDefaultMenu();
                this.numberOption = 0;
            }

            if (numberOption == 2) {
                breadMenu();
                cheeseMenu();
                fillingsMenu();
                weatherMenu();
                vegetablesMenu();
                saucesMenu();

                haveAdditions();
                if (numberOption == 1) {
                    addAdditions();

                    isCombo();
                    if (numberOption == 1) {

                        drinkTypeMenu();
                        drinkFlavorMenu();
                        cookieFlavorMenu();

                        serveFullMenu();
                        numberOption = 0;

                    }

                    if (numberOption == 2) {
                        serveAdditionsMenu();
                        numberOption = 0;
                    }
                }

                if (numberOption == 2) {

                    isCombo();
                    if (numberOption == 1) {
                        drinkTypeMenu();
                        drinkFlavorMenu();
                        cookieFlavorMenu();

                        serveComboMenu();
                        numberOption = 0;
                    }

                    if (numberOption == 2) {
                        serveNormalMenu();
                        numberOption = 0;
                    }
                }
            }

        } while (numberOption != 0);

    }

}
