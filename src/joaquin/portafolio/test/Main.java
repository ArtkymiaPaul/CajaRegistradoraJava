package joaquin.portafolio.test;

import joaquin.portafolio.objects.Product;
import joaquin.portafolio.storage.Database;

public class Main {
    public static void main(String[] args){
        Database database = new Database();
        Product product = database.getByIndex(0);
        System.out.println(product);
        product.setAmount(10);
    }
}
