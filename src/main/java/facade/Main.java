package facade;

import facade.system.Computer;

public class Main {
    public static void main(String[] args) {
        Computer facade = new Computer();
        facade.startComputer();
    }
}
