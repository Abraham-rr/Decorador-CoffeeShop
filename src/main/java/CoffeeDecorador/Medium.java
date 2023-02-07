
package CoffeeDecorador;


public class Medium extends Tam  {
    Beverage beverage;

    public Medium(Beverage beverage){

        this.beverage = beverage;
        beverage.tam = "Medium";

    }
    
    @Override
    public double cost() {
        return (beverage.cost()) + (beverage.cost()) * 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , " + beverage.getTam();
    }
}
