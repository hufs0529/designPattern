package templateMethod;

import templateMethod.db.AbstractServiceConnect;
import templateMethod.db.DefaultServiceConnect;

public class Main {
    public static void main(String[] args) {
        AbstractServiceConnect helper = new DefaultServiceConnect();
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}
