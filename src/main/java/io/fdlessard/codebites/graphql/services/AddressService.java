package io.fdlessard.codebites.graphql.services;

import io.fdlessard.codebites.graphql.dtos.AddressDto;
import io.fdlessard.codebites.graphql.mappers.AddressMapper;
import io.fdlessard.codebites.graphql.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressDto findAddressById(Long id) {

        return addressRepository.findById(id)
                .map(AddressMapper::map)
                .orElse(null);

    }

}
