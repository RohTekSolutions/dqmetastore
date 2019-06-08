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
@Table(name = "dq_rule")
public class Rule extends AbstractAuditableEntity {

    @Id
    @SequenceGenerator(name = "rule_seq", sequenceName = "rule_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rule_seq")
    private Long id;

    @Column(unique = true)
    private String ruleName;

    @Column(name="description")
    private String description;

    @ManyToOne 
    @JoinColumn(name="dq_measure_id",referencedColumnName="id")
    private Measure measure;

    @ManyToOne 
    @JoinColumn(name="dq_rule_category_id",referencedColumnName="id")
    private RuleCategory ruleCategory;
    
    @ManyToOne 
    @JoinColumn(name="rule_template_id",referencedColumnName="id")
    private RuleTemplate ruleTemplate;

    @OneToMany(mappedBy = "rule")
    private List<RuleEntityMap> ruleEntityMap;

    @OneToMany(mappedBy = "rule")
    private List<RuleVariableMap> ruleVariableMap;

    @OneToMany(mappedBy = "rule")
    private List<RuleSetMap> ruleSetMap;

    @Column(name="severity")
    private String severity;

    @Column(name="dq_tier")
    private String dqTier;


}
