package subwayApp;

import java.io.IOException;

public class Client {

    public static void main(String[] args) {
        
        Order orderDefault = new Order();
        System.out.println(orderDefault.getReceipt().getReceipt());

    }
}