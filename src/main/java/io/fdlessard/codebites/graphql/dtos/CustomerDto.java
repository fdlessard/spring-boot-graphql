package io.fdlessard.codebites.graphql.dtos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
public class CustomerDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String company;

    private List<AddressDto> addresses;

}
