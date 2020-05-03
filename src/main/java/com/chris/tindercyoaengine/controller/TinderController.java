package com.chris.tindercyoaengine.controller;

import com.chris.tindercyoaengine.client.TinderClient;
import com.chris.tindercyoaengine.model.tinder.TinderMatch;
import com.chris.tindercyoaengine.service.TinderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tinder")
public class TinderController {

    private final TinderService tinderService;
    private final TinderClient tinderClient;

    public TinderController(TinderService tinderService, TinderClient tinderClient) {
        this.tinderService = tinderService;
        this.tinderClient = tinderClient;
    }

    @GetMapping("/registerNewUsers")
    public ResponseEntity<?> registerNewUsers() {
        TinderMatch tinderMatch = tinderClient.getMatches();
        tinderService.registerNewUsers(tinderMatch);
        return new ResponseEntity<String>(HttpStatus.ACCEPTED);
    }
}
