package com.paypal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.paypal.model.AbstractAuditableEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dq_measure")
public class Measure extends AbstractAuditableEntity {

    @Id
    @SequenceGenerator(name = "measure_seq", sequenceName = "measure_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "measure_seq")
    private Long id;

    @Column(name="measure_name",unique = true)
    private String measureName;
    
    @Column(name="measure_definition")
    private String measureDefinition;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMeasureName() {
		return measureName;
	}

	public void setMeasureName(String measureName) {
		this.measureName = measureName;
	}

	public String getMeasureDefinition() {
		return measureDefinition;
	}

	public void setMeasureDefinition(String measureDefinition) {
		this.measureDefinition = measureDefinition;
	}
    
    
    
    
    
    
    
    
}
