package com.chris.tindercyoaengine.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "player_story")
@Data
public class PlayerStory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "story_id")
    int storyId;
    @Column(name = "tracker_id")
    int trackerId;
    @Column(name = "latest_page")
    int latestPage;

    boolean completed;

    @CreationTimestamp
    Timestamp timestamp;

    @Column(name = "updated_at")
    @UpdateTimestamp
    Timestamp updated_at;
}
