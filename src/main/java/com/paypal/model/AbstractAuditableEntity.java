package com.paypal.model;


import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


/**
 * created by imteyaza-1lm on 2019-05-21
 **/
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditListener.class)
public abstract class AbstractAuditableEntity {

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private String createBy;

    private String modifiedBy;
}
