package com.chris.tindercyoaengine.service;

import com.chris.tindercyoaengine.entity.Player;
import com.chris.tindercyoaengine.entity.PlayerTracker;
import com.chris.tindercyoaengine.repository.PlayerTrackerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerTrackerService {

    private final PlayerTrackerRepository playerTrackerRepository;

    public PlayerTrackerService(PlayerTrackerRepository playerTrackerRepository) {
        this.playerTrackerRepository = playerTrackerRepository;
    }

    public PlayerTracker save(PlayerTracker playerTracker) {
        return playerTrackerRepository.save(playerTracker);
    }

    public PlayerTracker newPlayerTrackerEntity(Player player) {
        PlayerTracker playerTracker = new PlayerTracker();
        playerTracker.setPlayerParent(player);
        playerTracker.setLatestStory(null);
        return playerTrackerRepository.save(playerTracker);
    }

    public void saveAll(List<PlayerTracker> playerTrackers) {
        playerTrackerRepository.saveAll(playerTrackers);
    }
}
