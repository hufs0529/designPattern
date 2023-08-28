package adapter;

public class Status {

    public static Float toNormal(Float point){
        return point * 2;
    }

    public static Float toPremium(Float point){
        return point * 5;
    }
}
