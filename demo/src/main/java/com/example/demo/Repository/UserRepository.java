package com.example.demo.Repository;

import com.example.demo.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>
{
    Optional<UserEntity> findOneByEmailAndPassword(String email, String password);
    UserEntity findByEmail(String email);
}