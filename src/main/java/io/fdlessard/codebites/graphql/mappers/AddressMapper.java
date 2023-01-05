package io.fdlessard.codebites.graphql.mappers;

import io.fdlessard.codebites.graphql.dtos.AddressDto;
import io.fdlessard.codebites.graphql.entities.Address;
import java.util.Collections;

import java.util.List;

public class AddressMapper {

    private AddressMapper() {
    }

    public static AddressDto map(Address address) {

        if(address == null) {
            return null;
        }

        return AddressDto.builder()
                .id(address.getId())
                .number(address.getNumber())
                .street (address.getStreet())
                .city(address.getCity())
                .postalCode(address.getPostalCode())
                .province(address.getProvince())
                .country(address.getCountry())
                .build();
    }

    public static List<AddressDto> map(List<Address> addresses) {

        if(addresses == null   || addresses.isEmpty()  ) {
            return Collections.emptyList();
        }

        return addresses.stream()
                .map(AddressMapper::map)
                .toList();
    }
}
