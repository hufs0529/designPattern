package abstractfactory;

import abstractfactory.sam.SamFactory;

public class FactoryInstance {
    public static BikeFactory getBikeFactory() {
        return new SamFactory();
    }
}
