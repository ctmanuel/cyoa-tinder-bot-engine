package com.chris.tindercyoaengine.repository;

import com.chris.tindercyoaengine.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    boolean existsByTinderMathId(String tinderMatchId);
}
