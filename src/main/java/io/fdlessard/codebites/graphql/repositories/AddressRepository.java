package io.fdlessard.codebites.graphql.repositories;

import io.fdlessard.codebites.graphql.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "addresses")
public interface AddressRepository extends CrudRepository<Address, Long>, PagingAndSortingRepository<Address, Long> {

}
