package com.paypal.model;

import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "dq_rule_variables_map")
public class RuleVariableMap extends AbstractAuditableEntity {
    @Id
    @SequenceGenerator(name = "dq_rule_vari_map_seq", sequenceName = "dq_rule_vari_map_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dq_rule_vari_map_seq")
    private Long id;

    
    @ManyToOne
    @JoinColumn(name="rule_id",referencedColumnName="id")
    private Rule rule;
    
    
    @ManyToOne
    @JoinColumn(name="variable_id",referencedColumnName="id")
    private RuleTemplateVariable ruleTemplateVariable;
    
    @Column(name="value")
    private Clob value;
    
   
}
