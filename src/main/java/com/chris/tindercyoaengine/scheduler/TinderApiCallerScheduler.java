package com.chris.tindercyoaengine.scheduler;

import com.chris.tindercyoaengine.client.TinderClient;
import com.chris.tindercyoaengine.model.tinder.TinderMatch;
import com.chris.tindercyoaengine.service.TinderService;
import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Log
public class TinderApiCallerScheduler {

    private final TinderClient tinderClient;
    private final TinderService tinderService;

    public TinderApiCallerScheduler(TinderClient tinderClient, TinderService tinderService) {
        this.tinderClient = tinderClient;
        this.tinderService = tinderService;
    }

    //@Scheduled(fixedRate = 10000)
    public void checkForNewMatches() throws InterruptedException {
        log.info("***************Registering New Users***************");
        long sleepTime = (long)(Math.random() * 1000L);
        Thread.sleep(sleepTime);
        TinderMatch matches = tinderClient.getUnmessagedMatches();
        tinderService.processUnregisteredMatches(matches);
    }

    @Scheduled(fixedRate = 500)
    public void swipeRight() throws InterruptedException {
        long sleepTime = (long)(Math.random() * 1000L);
        Thread.sleep(sleepTime);
        tinderClient.swipeRightOnNextUser();
    }

    public void checkForNewMessages(){

    }
}
