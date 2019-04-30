package io.zingoworks.qna.model.api.request;

public class JoinRequest {

    private String name;

    private String password;

    private String email;

    protected JoinRequest() {}

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "JoinRequest{" +
                "name='" + name + '\'' +
                ", password='" + "[PASSWORD]" + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
