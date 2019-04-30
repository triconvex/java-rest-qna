package io.zingoworks.qna.controller;

import io.swagger.annotations.Api;
import io.zingoworks.qna.model.User;
import io.zingoworks.qna.model.api.request.JoinRequest;
import io.zingoworks.qna.model.api.response.ApiResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@Api("User Api")
public class UserRestController {

    @GetMapping("{userId}")
    public ApiResult<User> read(@PathVariable Long userId) {
        return null;
    }

    @GetMapping
    public ApiResult<List<User>> list() {
        return null;
    }

    @PostMapping("join")
    public ApiResult<User> join(@RequestBody JoinRequest joinRequest) {
        return null;
    }

}
