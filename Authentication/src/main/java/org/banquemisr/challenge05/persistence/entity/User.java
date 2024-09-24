package org.banquemisr.challenge05.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ELECT_USER")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_id_sequence")
    @SequenceGenerator(name = "global_id_sequence", sequenceName = "global_id_sequence", allocationSize = 1)
    private Long id;

    private String name;
    private String email;
    private String password;
    private Boolean activated;

    @OneToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;
}
