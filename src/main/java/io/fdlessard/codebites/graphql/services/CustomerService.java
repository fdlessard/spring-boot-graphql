package io.fdlessard.codebites.graphql.services;

import io.fdlessard.codebites.graphql.dtos.CustomerDto;
import io.fdlessard.codebites.graphql.mappers.CustomerMapper;
import io.fdlessard.codebites.graphql.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerDto findCustomerById(Long id) {

        return customerRepository.findById(id)
                .map(CustomerMapper::map)
                .orElse(null);

    }

}
