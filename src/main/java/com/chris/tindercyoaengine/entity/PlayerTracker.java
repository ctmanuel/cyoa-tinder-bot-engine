package com.chris.tindercyoaengine.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "player_tracker")
@Data
public class PlayerTracker {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    int id;

    @OneToOne(optional = false, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    Player playerParent;

    @Column(name = "latest_story")
    Integer latestStory;

    @CreationTimestamp
    Timestamp timestamp;

    @Column(name = "updated_at")
    @UpdateTimestamp
    Timestamp updated_at;
}
