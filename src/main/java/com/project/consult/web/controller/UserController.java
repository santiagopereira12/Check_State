package com.project.consult.web.controller;

import com.project.consult.persistence.entity.UserEntity;
import com.project.consult.persistence.entity.projection.UserProjection;
import com.project.consult.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserProjection>> getAll(){
        return ResponseEntity.ok(this.userService.getAll());
    }

    @GetMapping("/{idUser}")
    public ResponseEntity<UserEntity> get(@PathVariable Integer idUser){
        return ResponseEntity.ok(this.userService.get(idUser));
    }
}
