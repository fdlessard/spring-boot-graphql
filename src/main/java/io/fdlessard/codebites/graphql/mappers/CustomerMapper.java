package io.fdlessard.codebites.graphql.mappers;

import io.fdlessard.codebites.graphql.dtos.CustomerDto;
import io.fdlessard.codebites.graphql.entities.Customer;

public class CustomerMapper {

    private CustomerMapper() {
    }

    public static CustomerDto map(Customer customer) {

        if(customer == null) {
            return null;
        }

        return CustomerDto.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .company(customer.getCompany())
                .addresses(AddressMapper.map(customer.getAddresses()))
                .build();
    }
}
