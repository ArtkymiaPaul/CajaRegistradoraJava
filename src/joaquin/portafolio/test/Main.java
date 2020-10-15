package joaquin.portafolio.test;

import joaquin.portafolio.controllers.Register;
import joaquin.portafolio.views.View;

public class Main {
    public static void main(String[] args){
        /*
        Database database = new Database();
        Product product = database.getByIndex(0);
        System.out.println(product);
        product.setAmount(10);

         */
        Register register = new Register();
        register.register();
    }
}
