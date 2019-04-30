package io.zingoworks.qna.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.zingoworks.qna.model.api.request.JoinRequest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static java.util.regex.Pattern.matches;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    private String password;

    private String email;

    private User(String name, String password, String email) {
        this(null, name, password, email);
    }

    private User(Long id, String name, String password, String email) {
        checkNotNull(name);
        checkNotNull(password);
        checkNotNull(email);
        checkArgument(4 <= name.length() && name.length() <= 12
                , "name must be between 4 and 12 chars");
        checkArgument(4 <= password.length() && password.length() <= 15
                , "password must be between 4 and 15 chars");
        checkArgument(checkEmail(email),
                "email must be proper format");

        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public static User of(JoinRequest joinRequest) {
        return new User(joinRequest.getName(), joinRequest.getPassword(), joinRequest.getEmail());
    }

    private static boolean checkEmail(String email) {
        return matches("[\\w~\\-.+]+@[\\w~\\-]+(\\.[\\w~\\-]+)+", email);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
