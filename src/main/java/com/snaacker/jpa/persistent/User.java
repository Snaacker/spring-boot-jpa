package com.snaacker.jpa.persistent;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    Set<BookUser> bookUser;
}
