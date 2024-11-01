package Factory;


public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName){
        
        if(factoryName.equalsIgnoreCase("VIP")){
            return new VIPCustomerFactory();
        }
        else if(factoryName.equalsIgnoreCase("Regular")){
            return new RegularCustomerFactory();
        }
        else if(factoryName.equalsIgnoreCase("Premium")){
            return new PremiumCustomerFactory();
        }
        return null;
    }
}
