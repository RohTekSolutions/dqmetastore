package com.paypal.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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
@Table(name = "dq_entity")
public class EntityData extends AbstractAuditableEntity {

    @Id
    @SequenceGenerator(name = "entity_seq", sequenceName = "entity_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_seq")
    private Long id;

    //TODO: Define the correct uniqueness.
    @Column(unique=true)
    private String name;
    
    @Column(name="subsidiary_name")
    private String subsidiaryName;
    
    @Column(name="domain_name")
    private String domainName;
    
    @Column(name="owner_name")
    private String ownerName;
    
    @Column(name="origin_source_system")
    private String originSourceSystem;
    
    @Column(name="availability_layer")
    private String availabilityLayer;
    
    @Column(name="entity_type")
    private String entityType;
    
    @Column(name="entity_location")
    private String entityLocation;
    
    @ManyToOne
    @JoinColumn(name="connection_id",referencedColumnName="id")
    private ConnectionDetails connection;
    
    @Column(name="unq_row_id")
    private String unqRowId;

    @OneToMany(mappedBy = "entityData")
    private List<RuleEntityMap> ruleEntityMap;

























    private String uniqueRowId;

}
