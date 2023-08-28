package strategy;

public class Main {
    public static void main(String[] args) {

        Normal normal = new Normal();
        normal.buy();
        normal.bucket();

        Premium premium = new Premium();
        premium.buy();
        premium.bucket();
        premium.accumulate();
    }

}
