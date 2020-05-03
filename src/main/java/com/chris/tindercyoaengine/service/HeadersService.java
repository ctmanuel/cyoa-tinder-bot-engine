package com.chris.tindercyoaengine.service;

import com.chris.tindercyoaengine.entity.Headers;
import com.chris.tindercyoaengine.repository.HeadersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class HeadersService {
    private final HeadersRepository headersRepository;

    public HeadersService(HeadersRepository headersRepository) {
        this.headersRepository = headersRepository;
    }

    public List<Headers> getAuthHeadersFromDb() {
        return new ArrayList<>(headersRepository.getAppSessionAndAuthToken());
    }
}
