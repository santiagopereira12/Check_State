package com.project.consult.persistence.repository;

import com.project.consult.persistence.entity.UserEntity;
import com.project.consult.persistence.entity.projection.UserProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface UserRepository extends ListCrudRepository<UserEntity,Integer> {
    @Query(value = "SELECT * FROM demo.user",nativeQuery = true)
    List<UserProjection> findAllUser();

    @Query(value = "SELECT * FROM demo.user WHERE id = ?",nativeQuery = true)
    List<UserProjection> findAllUserId(Integer idUser);
}
