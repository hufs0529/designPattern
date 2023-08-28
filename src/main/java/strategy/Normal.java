package strategy;

public class Normal extends Member {
    @Override
    void buy() {
        System.out.println("Can delievered in 3 days");
    }

    @Override
    void bucket() {
        System.out.println("Can add 5 products");
    }
}
