package com.paypal.model;

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
@Table(name = "dq_rule_template_variables")
public class RuleTemplateVariable extends AbstractAuditableEntity {
    @Id
    @SequenceGenerator(name = "dq_rule_template_vari_seq", sequenceName = "dq_rule_template_vari_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dq_rule_template_vari_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name="rule_template_id",referencedColumnName="id")
    private RuleTemplate ruleTemplate;

    @Column(name="variable_name")
    private String variableName;

    @Column(name="mandatory_flg")
    private Boolean mandatoryFlg;

    @Column(name="default_value")
    private String defaultValue;



}
