
package CoffeeDecorador;

public abstract class Beverage {
    String description = "Unknown Beverage";
    String tam = "Unknow tam";


    public String getDescription() {
        return description;
    }
   
     public String getTam(){
        return tam;
    }
    public abstract double cost();
    
} 