package com.distortedrealities.backend.repository;

import com.distortedrealities.backend.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * Organization: Distorted Realities
 * Author: Connor Vass
 * Created: February 2nd, 2025
 *
 * Description: Entry repository for entry table
 */


public interface EntryRepository extends JpaRepository<Entry, Long> {
}
