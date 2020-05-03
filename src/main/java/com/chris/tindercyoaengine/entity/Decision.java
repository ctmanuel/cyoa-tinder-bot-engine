package com.chris.tindercyoaengine.entity;

import com.chris.tindercyoaengine.model.Choice;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "decision")
@Data
public class Decision {

    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    @JoinColumn(name = "parent_page_id")
    Page parentPage;

    @ManyToOne
    @JoinColumn(name = "next_page_id")
    Page nextPage;

    Choice choice;
    String text;

    @CreationTimestamp
    Timestamp timestamp;

    @Column(name = "updated_at")
    @UpdateTimestamp
    Timestamp updated_at;

}
