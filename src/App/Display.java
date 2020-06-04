/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author isa
 */
public class Display {
    
    /*
    This class was just used to properly display the application.
    It looked very strange when I tried to remove this and make View the main class.
    */
    
    private static View view;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        view = new View();
        view.setVisible(true);
    }


    
}
