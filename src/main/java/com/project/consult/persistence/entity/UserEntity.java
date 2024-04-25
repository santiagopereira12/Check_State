package com.project.consult.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    @Column(name = "ndoc")
    private Integer documento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "date_agregado")
    private Date dtAgregado;
}
