package singleton;

public class Main {
    public static void main(String[] args) {
        CommandCenter commandCenter1 = CommandCenter.getInstance();
        CommandCenter commandCenter2 = CommandCenter.getInstance();

        System.out.println(commandCenter1.getNotice());
        System.out.println(commandCenter2.getNotice());

        commandCenter1.setNotice("Hmmm...??");
        System.out.println(commandCenter1.getNotice());
        System.out.println(commandCenter2.getNotice());

    }
}
