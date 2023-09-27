package com.tms.libera.repository;

import com.tms.libera.domain.Role;
import com.tms.libera.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer> {
    List<UserInfo> findAllByRole(Role role);

    //@Modifying - если мы изменяем Entity(INSERT, DELETE, UPDATE)
    @Query(nativeQuery = true, value = "SELECT * FROM user_unfo WHERE last_name = :fn")
    Optional<UserInfo> findUsersByLastName(String fn);
}