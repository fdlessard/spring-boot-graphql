package io.fdlessard.codebites.graphql.controllers;

import io.fdlessard.codebites.graphql.dtos.CustomerDto;
import io.fdlessard.codebites.graphql.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class CustomerController {

    private final CustomerService customerService;

    @QueryMapping
    public CustomerDto findCustomerById(@Argument Long id) {
        return customerService.findCustomerById(id);
    }

}
