package com.snaacker.jpa.persistent;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book")
@NoArgsConstructor
@Getter
@Setter
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "title")
    String title;

    @Column(name = "quantity")
    int quantity;

    @Column(name = "available")
    int available;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "author_id")
    Author author;

    @Column(name = "genre")
    String genre;

    @Column(name = "publish_date")
    @Temporal(TemporalType.TIMESTAMP)
    Date publishDate;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    Set<BookUser> bookUser;

    @ManyToMany Set<Library> library;
}
