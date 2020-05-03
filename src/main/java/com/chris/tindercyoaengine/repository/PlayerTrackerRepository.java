package com.chris.tindercyoaengine.repository;

import com.chris.tindercyoaengine.entity.PlayerTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerTrackerRepository extends JpaRepository<PlayerTracker,Integer> {
}
