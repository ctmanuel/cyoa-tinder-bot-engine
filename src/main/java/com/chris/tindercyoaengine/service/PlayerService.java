package com.chris.tindercyoaengine.service;

import com.chris.tindercyoaengine.entity.Player;
import com.chris.tindercyoaengine.model.tinder.TinderMatch;
import com.chris.tindercyoaengine.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public boolean existsByTinderMatchId(String tinderMatchId) {
        return playerRepository.existsByTinderMathId(tinderMatchId);
    }

    public Player save(Player player) {
        return playerRepository.save(player);
    }

    public void saveAll(List<Player> playerList) {
        playerRepository.saveAll(playerList);
    }
}
