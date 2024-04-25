package com.project.consult.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "state")
public class StateEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idState;
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "state")
    private boolean state;
}
