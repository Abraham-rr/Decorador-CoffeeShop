
package CoffeeDecorador;


public class Large extends Tam {
     Beverage beverage;

    public Large(Beverage beverage){

        this.beverage = beverage;
        beverage.tam = "Large";

    }
    
     @Override
    public double cost() {
        return (beverage.cost()) + (beverage.cost()) * 2;
    }

     @Override
    public String getDescription() {
        return beverage.getDescription() + " , " + beverage.getTam();
    }
}
