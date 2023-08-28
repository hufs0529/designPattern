package abstractfactory;

public class Main {

    public static void main(String[] args) {
        BikeFactory bikeFactory = FactoryInstance.getBikeFactory();

        Body body = bikeFactory.createBody();
        Wheel wheel = bikeFactory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }



}
