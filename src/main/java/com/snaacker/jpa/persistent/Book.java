package com.snaacker.jpa.persistent;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "book")
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "name")
    String name;
    @ManyToOne(fetch = FetchType.LAZY)
    User user;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    Set<BookLibrary> bookLibrary;
}
