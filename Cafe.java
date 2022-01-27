/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

/**
 *
 * @author 19205308
 */
public class Cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drink d1;
        Drink d2;
        d1 = new Tea();
        d2 = new Coffee();
        d1.prepareRecipe();
        d2.prepareRecipe();
        
    }
    
}
