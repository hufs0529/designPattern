package facade.system;

public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Memory Location " + position + " " + data.toString() + "upload data");
    }
}
