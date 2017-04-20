/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab7;

import java.util.ArrayList;

/**
 *
 * @author Raam
 */
public class Pizza {
    
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
    
    public void Pizza() {
    }
    
    public void prepare(){
        System.out.println("Peparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding topping: ");
        for(int i = 0; i<toppings.size(); i++) {
            System.out.println(" "+toppings.get(i));
        }
    }
    
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    public void box(){
        System.out.println("Place pizza in offical PizzaStore box ");
    }
    
    public String getName() {
        return name;
    }
   
}
