package io.zingoworks.qna.service;

import io.zingoworks.qna.model.User;
import io.zingoworks.qna.model.api.request.JoinRequest;
import io.zingoworks.qna.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User join(JoinRequest joinRequest) {
        return userRepository.save(User.of(joinRequest));
    }

}
