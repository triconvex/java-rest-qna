package io.zingoworks.qna.repository;

import io.zingoworks.qna.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
