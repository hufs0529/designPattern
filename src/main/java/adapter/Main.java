package adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.toNormal(40f));
        System.out.println(adapter.toPremium(80f));
    }
}
