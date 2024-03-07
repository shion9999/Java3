package com.example.demo.entity;
//データベースのレコードを格納するためのクラス

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @Column(name = "created_at", updatable = false)
    public Date createdAt;

    @Column(name = "modified_at")
    private Date modifiedAt;

    @PrePersist
    public void onPrePersist() {
        setCreatedAt(new Date());
        setModifiedAt(new Date());
    }

    @PreUpdate
    public void onPreUpdate() {
        setModifiedAt(new Date());
    }
}
