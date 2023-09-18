package com.snaacker.jpa.repository;

import com.snaacker.jpa.persistent.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "library", path = "library")

public interface LibraryRepository  extends CrudRepository<Library, Long> {}
