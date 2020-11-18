package Main;

import Controller.DatabaseHandler;
import View.MainMenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author 1119038 Elangel Neilea Shaday
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Connect to Database
        DatabaseHandler DB = new DatabaseHandler();
        DB.connect();
        // Run Menu GUI
        MainMenu menu = new MainMenu();
    }
    
}
