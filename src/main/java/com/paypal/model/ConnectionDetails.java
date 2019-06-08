package com.paypal.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "dq_connection")
public class ConnectionDetails extends AbstractAuditableEntity {

    @Id
    @SequenceGenerator(name = "connection_seq", sequenceName = "connection_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "connection_seq")
    private Long id;

    @Column(name="name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="security_zone")
    private SecurityZone securityZone;

    @Column(name="connection_type")
    private String connectionType;

    @Column(name="url")
    private String url;

    @Column(name="username")
    private String userName;

    @Column(name="password")
    private String password;


    @OneToMany(mappedBy = "connection")
    private List<EntityData> entityData;




}
