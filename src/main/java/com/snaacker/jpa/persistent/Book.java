package com.snaacker.jpa.persistent;

import jakarta.persistence.*;
import java.util.Date;
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

  @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
  Set<BookUser> bookUser;

  @ManyToMany
  Set<Library> library;

}
