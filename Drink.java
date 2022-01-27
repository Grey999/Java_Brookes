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
public class Drink {
    
    void prepareRecipe()
    {
        BoilWater();
        PrepareDrink();
        PourLiquid();
        AddExtra();

    }
    
    public void AddExtra() {}

    public void PrepareDrink() {}


    public void PourLiquid() {
        System.out.println("Pour liquid into the cup");
    }


    public void BoilWater() {
        System.out.println("Boil water");
    }
    
    
}

class Coffee extends Drink
{

    public void AddExtra() {
        System.out.println("Add sugar and milk");
       
    }

    public void PrepareDrink() {
        System.out.println("Drip coffee through filter");
        
    }
    
}

class Tea extends Drink
{

    public void AddExtra() {
        System.out.println("Add lemon");
        
    }

    public void PrepareDrink() {
        System.out.println("Step Tea into the water");
        
    }
    
}
