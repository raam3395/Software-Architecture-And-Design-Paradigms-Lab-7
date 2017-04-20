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
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")){
            pizza = new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else {
            pizza = null;
        }
        return pizza;
    } 
    
}
