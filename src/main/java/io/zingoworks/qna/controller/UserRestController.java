package io.zingoworks.qna.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.zingoworks.qna.model.User;
import io.zingoworks.qna.model.api.request.JoinRequest;
import io.zingoworks.qna.model.api.response.ApiResult;
import io.zingoworks.qna.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@Api(tags = "User API")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("{userId}")
    public ApiResult<User> read(@PathVariable Long userId) {
        return null;
    }

    @GetMapping
    public ApiResult<List<User>> list() {
        return null;
    }

    @ApiOperation(value = "회원가입 (API 토큰 필요없음)")
    @PostMapping("join")
    public ApiResult<User> join(@RequestBody JoinRequest joinRequest) {
        return new ApiResult<>(userService.join(joinRequest));
    }

}
