package com.paypal.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
@Table(name = "dq_client")
public class Client extends AbstractAuditableEntity {

    @Id
    @SequenceGenerator(name = "client_seq", sequenceName = "client_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    private Long id;

    @Column(name="client_name",unique = true)
    private String clientName;
    
    @Column(name="business_category")
    private String businessCategory;
    
    @Column(name="business_sub_category")
    private String businessSubCategory;
    
    @Column(name="contact_email")
    private String contactEmail;
    
    @Column(name="contact_number")
    private String contactNumber;

    @OneToMany(mappedBy = "client")
    private List<RuleSet> ruleSet;


}
