package com.example.aqua.modules.user;

import com.example.aqua.modules.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.aqua.shared.dtos.ApiResponse.ApiResponse;
import java.util.Map;
import com.example.aqua.models.User;
import com.example.aqua.modules.user.dtos.CreateUserReq;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

        @PostMapping("/create-user")
        public ResponseEntity<ApiResponse> createUser(@RequestBody CreateUserReq body) {
            Object data = userService.createUser(body);
            return ResponseEntity.ok(new ApiResponse(200, "User created successfully", data));
        }

        @GetMapping("/{id}")
        public ResponseEntity<ApiResponse> getUserById(@PathVariable Long id) {
            Object data = userService.getUserById(id);
            return ResponseEntity.ok(new ApiResponse(200, "User retrieved successfully", data));
        }
}