package com.paypal.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.paypal.model.AbstractAuditableEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import io.swagger.annotations.ApiModelProperty;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dq_rule_set")
public class RuleSet extends AbstractAuditableEntity {
    @Id
    @SequenceGenerator(name = "dq_rule_seq", sequenceName = "dq_rule_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dq_rule_seq")
    private Long id;

    @ApiModelProperty(notes = "Name of the RuleSetName")
    private String name;

    @ApiModelProperty(notes = "Name of the Execution Mode")
    @Column(name="execution_mode")
    private String executionMode;

    @ApiModelProperty
    @Column(name="notify_flag")
    private String notifyFlg;
    
    
    @ManyToOne
    @JoinColumn(name="dq_client_id",referencedColumnName="id")
    private Client client;


    @OneToMany(mappedBy = "ruleSet")
    private List<RuleSetMap> ruleSetMap;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	@ApiModelProperty(notes = "Name of the RuleSetName")
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getExecutionMode() {
		return executionMode;
	}


	public void setExecutionMode(String executionMode) {
		this.executionMode = executionMode;
	}


	public String getNotifyFlg() {
		return notifyFlg;
	}


	public void setNotifyFlg(String notifyFlg) {
		this.notifyFlg = notifyFlg;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public List<RuleSetMap> getRuleSetMap() {
		return ruleSetMap;
	}


	public void setRuleSetMap(List<RuleSetMap> ruleSetMap) {
		this.ruleSetMap = ruleSetMap;
	}


    
    
    
    

}
