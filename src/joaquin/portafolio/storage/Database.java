package joaquin.portafolio.storage;

import joaquin.portafolio.objects.Meat;
import joaquin.portafolio.objects.Potato;
import joaquin.portafolio.objects.Product;
import joaquin.portafolio.objects.Rice;

public class Database {
    private Product[] products;

    public Database(){
        products = new Product[3];
        Product potato = new Potato("Chola");
        Product rice = new Rice("Flor");
        Product meat = new Meat("Lomo Fino");
        products[0] = potato;
        products[1] = rice;
        products[2] = meat;
    }

    public Product getByIndex(int i){
        if(i < 0 || i > 2){
            System.out.println("Indice no valido");
            return null;
        }
        return products[i];
    }

    public Product[] getAll(){
        return products;
    }
}
