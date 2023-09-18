package com.snaacker.jpa.persistent;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;

  @Column(name = "name")
  String name;

  @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
  Set<BookUser> bookUser;
}
