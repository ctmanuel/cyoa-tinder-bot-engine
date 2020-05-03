package com.chris.tindercyoaengine.controller;

import com.chris.tindercyoaengine.client.TinderClient;
import com.chris.tindercyoaengine.entity.Player;
import com.chris.tindercyoaengine.model.tinder.TinderMatch;
import com.chris.tindercyoaengine.service.TinderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private final TinderClient tinderClient;
    private final TinderService tinderService;

    public PlayerController(TinderClient tinderClient, TinderService tinderService) {
        this.tinderClient = tinderClient;
        this.tinderService = tinderService;
    }

    @PostMapping("/response")
    public void handlePlayerResponseMessage() {
        
    }

    @GetMapping("/testPlayer")
    public Player addTestPlayer() {
        return tinderService.test();
    }

    @GetMapping("/matches")
    public ResponseEntity<TinderMatch> getMatches() {
        return new ResponseEntity<TinderMatch>(tinderClient.getMatches(), HttpStatus.OK);
    }


}
