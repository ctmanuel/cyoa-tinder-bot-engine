package com.chris.tindercyoaengine.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "page")
@Data
public class Page {
    @Id
    @GeneratedValue
    int id;

    @Column(name = "page_number")
    int pageNumber;

    String text;

    @Column(name = "is_playing")
    boolean isPlaying;

    @CreationTimestamp
    Timestamp timestamp;

    @Column(name = "updated_at")
    @UpdateTimestamp
    Timestamp updated_at;

    @OneToMany(mappedBy = "parentPage")
    Set<Decision> decisions;
}
