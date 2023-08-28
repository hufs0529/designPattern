package strategy;

public class Premium extends Member implements Bonus{
    @Override
    void buy() {
        System.out.println("Can delivered in 1 days");
    }

    @Override
    void bucket() {
        System.out.println("Can add 10 products");
    }

    @Override
    public void accumulate() {
        System.out.println("Accumulate 3%");
    }
}
