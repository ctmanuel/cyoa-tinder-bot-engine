package com.chris.tindercyoaengine.repository;

import com.chris.tindercyoaengine.entity.Headers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface HeadersRepository extends JpaRepository<Headers, String> {

    @Query(nativeQuery = true, value = "SELECT * FROM tinder_cyoa.headers where header = 'app-session-id' or header = 'X-Auth-Token';")
    Collection<Headers> getAppSessionAndAuthToken();
}
