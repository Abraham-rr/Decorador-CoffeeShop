
package CoffeeDecorador;


public class Small extends Tam{
    Beverage beverage;
    
    public Small(Beverage beverage){
         this.beverage = beverage;
        beverage.tam = "small";
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
   
     @Override
    public String getDescription() {
        return beverage.getDescription() + " , " + beverage.getTam();
    }
    
}
