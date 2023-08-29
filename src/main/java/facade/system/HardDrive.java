package facade.system;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println(size + lba + "read");
        return "complete".getBytes();
    }
}
