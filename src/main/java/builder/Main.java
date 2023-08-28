package builder;

public class Main {

    public static void main(String[] args) {

        Member member = MemberBuilder.start().setEmail("example@example.com").setPassword("abcd1234!").setNickname("myname").build();

        System.out.println(member.toString());
    }

}
