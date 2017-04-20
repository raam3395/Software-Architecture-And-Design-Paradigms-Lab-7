/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab7;

/**
 *
 * @author Raam
 */
public abstract class PizzaStore {
    public Pizza pizza;
    public Pizza orderPizza (String type){
         pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    abstract Pizza createPizza(String type);
}
