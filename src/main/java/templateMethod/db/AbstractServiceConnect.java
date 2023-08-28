package templateMethod.db;

public abstract class AbstractServiceConnect {

    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String email, String password);

    protected abstract int authorization(String nickname);

    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo){
        String decodedInfo = doSecurity(encodedInfo);

        String email = "example@example.com";
        String password = "abcd1234!";

        if (!authentication(email, password)) {
            throw new Error("아이디 암호 불일치");
        }

        String nickname = "Java";
        int i = authorization(nickname);

        switch (i) {
            case -1:
                System.out.println("Shut down");
                throw new Error("Shut down");
            case 0:
                System.out.println("ADMIN");
                break;
            case 1:
                System.out.println("NORMAL");
                break;
            case 2:
                System.out.println("PREMIUM");
                break;
            default:
                break;
        }
        return connection(decodedInfo);
    }
}
