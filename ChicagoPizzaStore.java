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
public class ChicagoPizzaStore extends PizzaStore{
    
    @Override
    Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    } 
}
