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
@Table(name = "dq_rule_category")
public class RuleCategory extends AbstractAuditableEntity {
    @Id
    @SequenceGenerator(name = "dq_rule_category_seq", sequenceName = "dq_rule_category_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dq_rule_category_seq")
    private Long id;

    @Column(name="rule_category")
    private String ruleCategory;

    @Column(name="category_definition")
    private String categoryDefinition;

}
