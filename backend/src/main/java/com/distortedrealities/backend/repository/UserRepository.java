package com.distortedrealities.backend.repository;

import com.distortedrealities.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * Organization: Distorted Realities
 * Author: Connor Vass
 * Created: February 2nd, 2025
 *
 * Description: User repository for user table
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
