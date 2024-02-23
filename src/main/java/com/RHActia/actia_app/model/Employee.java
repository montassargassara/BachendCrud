package com.RHActia.actia_app.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    @ManyToOne(optional = true)
    @JoinColumn(name="team_id")
    private Team team ;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "birthDate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    private String photo;


 }