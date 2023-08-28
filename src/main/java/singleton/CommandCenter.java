package singleton;

public class CommandCenter {
    private static CommandCenter instance;
    private String notice;

    private CommandCenter() {
        notice = "Follow Our Rule";
    }

    public static CommandCenter getInstance(){
        if (instance==null){
            System.out.println("Create new");
            instance = new CommandCenter();
        }else {
            System.out.println("Already Created");
        }
        return instance;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice){
        this.notice = notice;
    }
}
