package com.chris.tindercyoaengine.client;

import com.chris.tindercyoaengine.entity.Headers;
import com.chris.tindercyoaengine.model.tinder.TinderMatch;
import com.chris.tindercyoaengine.service.HeadersService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
@Log
public class TinderClient {

    private final RestTemplate restTemplate;
    private final HttpHeaders headers;
    private final HeadersService headersService;
    private final String likes_url = "https://api.gotinder.com/like/{}?locale=en&s_number={}";
    private final String core_url = "https://api.gotinder.com/v2/recs/core?locale=en";
    private final String matches_url = "https://api.gotinder.com/v2/matches?count=60&is_tinder_u=false&locale=en";

    @Autowired
    public TinderClient(RestTemplate restTemplate, @Qualifier("tinderHeaders") HttpHeaders headers, HeadersService headersService) {
        this.restTemplate = restTemplate;
        this.headers = headers;
        this.headersService = headersService;
    }

    public TinderMatch getUnmessagedMatches() {
        getLatestHeaders();
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        try {
            ResponseEntity<String> matchesResponse = restTemplate.exchange(matches_url+"&message=0", HttpMethod.GET, entity, String.class);
            ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return objectMapper.readValue(matchesResponse.getBody(), TinderMatch.class);
        } catch (Exception e) {
            log.severe(e.getMessage());
        }
        return null;
    }

    public TinderMatch getMessagedMatches() {
        getLatestHeaders();
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        try {
            ResponseEntity<String> matchesResponse = restTemplate.exchange(matches_url+"&message=1", HttpMethod.GET, entity, String.class);
            ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return objectMapper.readValue(matchesResponse.getBody(), TinderMatch.class);
        } catch (Exception e) {
            log.severe(e.getMessage());
        }
        return null;
    }

    public void swipeRightOnNextUser() {

    }

    public void checkNewMatches() {

    }

    private void getLatestHeaders() {
        List<Headers> latestAuthHeaders = headersService.getAuthHeadersFromDb();
        latestAuthHeaders.forEach(headers1 -> this.headers.put(headers1.getHeader(), Collections.singletonList(headers1.getValue())));

    }
}
