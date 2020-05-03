package com.chris.tindercyoaengine.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "story")
@Data
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "page_id")
    int pageId;

    String title;
    String description;

    @CreationTimestamp
    Timestamp timestamp;

    @Column(name = "updated_at")
    @UpdateTimestamp
    Timestamp updated_at;
}
