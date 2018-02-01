package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Igor Hnes on 2/1/18.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users LIMIT ?1;", nativeQuery = true)
    List<User> findAll(int limit);

    @Query(value = "SELECT * FROM users WHERE id BETWEEN ?1 AND ?2", nativeQuery = true)
    List<User> findAllBetweenId(Long from, Long to);

    @Modifying
    @Query(value = "UPDATE users SET name = ?1 WHERE id = ?2 ", nativeQuery = true)
    User superUpdate(String name, Long id);
}
