package com.project.consult.service;

import com.project.consult.persistence.entity.UserEntity;
import com.project.consult.persistence.entity.projection.UserProjection;
import com.project.consult.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserProjection> getAll(){
        try {
            return userRepository.findAllUser();
        }catch (Exception e){
            System.out.println("p");
            throw new RuntimeException(e);
        }
    }

    public UserEntity get(Integer idUser) {
        return (UserEntity) userRepository.findAllUserId(idUser);
    }
}
