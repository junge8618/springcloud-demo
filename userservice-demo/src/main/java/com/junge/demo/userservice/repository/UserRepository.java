package com.junge.demo.userservice.repository;

import com.junge.demo.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author liuxj
 * @date 2018-12-31 20:19
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}