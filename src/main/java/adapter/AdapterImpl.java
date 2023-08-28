package adapter;

public class AdapterImpl implements Adapter{

    @Override
    public Float toNormal(Float f) {
        System.out.println("Normal User");
        return Status.toNormal(f.floatValue());
    }

    @Override
    public Float toPremium(Float f) {
        System.out.println("Premium User");
        return Status.toPremium(f.floatValue());
    }
}
