package templateMethod.db;

public class DefaultServiceConnect extends AbstractServiceConnect{
    @Override
    protected String doSecurity(String string) {
        System.out.println("decode");
        return string;
    }

    @Override
    protected boolean authentication(String email, String password) {
        System.out.println("Authentication");
        return true;
    }

    @Override
    protected int authorization(String nickname) {
        System.out.println("Authority");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("connection");
        return info;
    }
}
