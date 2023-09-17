package com.snaacker.jpa.persistent;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "library")
@NoArgsConstructor
@Getter
@Setter
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "name")
    String name;
    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    Set<BookLibrary> bookLibrary;
}
