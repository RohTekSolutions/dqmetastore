package com.paypal.model;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;


/**
 * created by imteyaza-1lm on 2019-05-23
 **/
public class AuditListener {

	
	@PrePersist
	public void setCreatedOn(AbstractAuditableEntity auditable) {
		//auditab
		
	}

	@PreUpdate
	public void setUpdatedOn(AbstractAuditableEntity auditable) {
		
	}
	 
}
