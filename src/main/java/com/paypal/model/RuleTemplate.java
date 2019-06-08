package com.paypal.model;

import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "dq_rule_template")
public class RuleTemplate extends AbstractAuditableEntity {

    @Id
    @SequenceGenerator(name = "rule_template_seq", sequenceName = "rule_template_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rule_template_seq")
    private Long id;

    @Column(name="template_type")
    private String templateType;

    @Column(name="template_sub_type")
    private String templateSubType;

    @Column(name="template_query")
    private String templateQuery;

    @Column(name="entity_roles")
    private String entityRoles;

    @Column(name="implementation_name")
    private String implementationName;

    @Column(name="description")
    private String description;

    @OneToMany(mappedBy = "ruleTemplate")
    private Set<Rule> rule;

    @OneToMany(mappedBy = "ruleTemplate")
    private Set<RuleTemplateVariable> ruleTemplateVariable;


}
