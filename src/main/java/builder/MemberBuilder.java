package builder;

public class MemberBuilder {
    private Member member;

    private MemberBuilder() {
        member = new Member("email", "password", "nickname");
    }

    public static MemberBuilder start() {
        return new MemberBuilder();
    }

    public MemberBuilder setEmail(String email){
        member.setEmail(email);
        return this;
    }

    public MemberBuilder setPassword(String password){
        member.setPassword(password);
        return this;
    }

    public MemberBuilder setNickname(String nickname){
        member.setNickname(nickname);
        return this;
    }

    public Member build() {
        return this.member;
    }
}
