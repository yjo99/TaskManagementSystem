package org.banquemisr.challenge05.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
@Getter
@Setter
public class Role extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_id_sequence")
    @SequenceGenerator(name = "global_id_sequence", sequenceName = "global_id_sequence", allocationSize = 1)
    private Long id;

    private String RoleName;
    private String authRole;
}
