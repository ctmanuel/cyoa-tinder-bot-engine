package com.chris.tindercyoaengine.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "headers")
@Data
public class Headers {
    String header;
    String value;
}
