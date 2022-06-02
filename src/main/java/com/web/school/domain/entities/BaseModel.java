package com.web.school.domain.entities;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {

    @CreatedDate
    @Column(name = "DAT_CREATION")
    protected LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "DAT_UPDATE")
    protected LocalDateTime updatedAt;

    @LastModifiedDate
    @Column(name = "NAM_CHANGE_AGENT")
    protected String modifiedBy;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.modifiedBy = "API";
    }

    @PreUpdate
    public void preUpdate(){
        this.updatedAt = LocalDateTime.now();
        this.modifiedBy = "API";
    }

}
