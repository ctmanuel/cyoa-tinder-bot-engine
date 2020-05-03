package com.chris.tindercyoaengine.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "player")
@Data
public class Player implements Serializable {

    @Id
    @GeneratedValue
    int id;

    @Column(name = "tinder_match_id")
    String tinderMathId;
    String name;

    @Column(name = "is_playing")
    boolean isPlaying;

    @CreationTimestamp
    Timestamp timestamp;

    @Column(name = "updated_at")
    @UpdateTimestamp
    Timestamp updated_at;
}
