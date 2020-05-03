package com.chris.tindercyoaengine.service;

import com.chris.tindercyoaengine.entity.Player;
import com.chris.tindercyoaengine.entity.PlayerTracker;
import com.chris.tindercyoaengine.model.tinder.TinderMatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TinderService {

    private final PlayerService playerService;
    private final PlayerTrackerService playerTrackerService;

    @Autowired
    public TinderService(PlayerService playerService, PlayerTrackerService playerTrackerService) {
        this.playerService = playerService;
        this.playerTrackerService = playerTrackerService;
    }

    public void processUnregisteredMatches(TinderMatch tinderMatches) {
        List<Player> registeredPlayers = registerNewUsers(tinderMatches);
        //registeredPlayers.forEach();
    }

    private List<Player> registerNewUsers(TinderMatch tinderMatch){
        List<Player> playerList = new ArrayList<>();
        List<PlayerTracker> playerTrackers = new ArrayList<>();
        tinderMatch.getData().getMatches().forEach( match -> {
            if(!playerService.existsByTinderMatchId(match.getId())) {
                Player newPlayer = new Player();
                newPlayer.setName(match.getPerson().getName());
                newPlayer.setPlaying(false);
                newPlayer.setTinderMathId(match.getId());;
                playerList.add(newPlayer);
            }
        });
        playerService.saveAll(playerList);
        playerList.forEach(player -> {
            PlayerTracker playerTracker = new PlayerTracker();
            playerTracker.setPlayerParent(player);
        });
        playerTrackerService.saveAll(playerTrackers);
        return playerList;
    }

    private void messageNewUser(Player player) {
        //todo figure out how to send messages here
    }
}
