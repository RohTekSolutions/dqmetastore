package com.paypal.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "dq_rule_set_map")
public class RuleSetMap extends AbstractAuditableEntity {
    @Id
    @SequenceGenerator(name = "dq_rule_set_map_seq", sequenceName = "dq_rule_set_map_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dq_rule_set_map_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name="rule_set_id",referencedColumnName="id")
    private RuleSet ruleSet;
    
    
    @ManyToOne
    @JoinColumn(name="rule_id",referencedColumnName="id")
    private Rule rule;
    
    @Column(name="active_flag")
    private Character activeFlag;

    @Column(name="expired_ts")
    private LocalDateTime expiredTs;
    
    
}
