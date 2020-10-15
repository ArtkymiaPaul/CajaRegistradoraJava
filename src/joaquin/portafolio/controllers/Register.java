package joaquin.portafolio.controllers;

import joaquin.portafolio.storage.Database;
import joaquin.portafolio.views.View;

public class Register {

    private Database database;

    public Register(){
        database = new Database();
    }

    //register inicia el proceso de la registradora
    public void register(){
        View.showHeaderPrincipal();
        View.showMenuPrincipal();
        int option;
        do {
            View.showGetOption();
            option = View.getOption();
            switch(option){
                case 1:
                    View.showBuyHeader();
                    break;
                case 2:
                    View.showSaleHeader();
                    break;
                case 3:
                    View.showStockHeader();
                    break;
                case 4:
                    View.showBuyListHeader();
                    break;
                case 5:
                    View.showSaleListHeader();
                    break;
                case 6:
                    View.showExitProgram();
                    // TODO agregar la salida del sistema
                    break;
                default:
                    View.showInvalidOption();
            }
        }while (option < 1 || option >6);

    }
}
