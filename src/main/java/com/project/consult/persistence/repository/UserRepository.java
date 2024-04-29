package com.project.consult.persistence.repository;

import com.project.consult.persistence.entity.UserEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<UserEntity,Integer> {
}
