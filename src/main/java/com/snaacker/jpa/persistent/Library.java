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

  @ManyToMany(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "book_library",
      joinColumns = {@JoinColumn(name = "library_id")},
      inverseJoinColumns = {@JoinColumn(name = "book_id")})
  Set<Book> book;
}
