package io.fdlessard.codebites.graphql.controllers;

import io.fdlessard.codebites.graphql.dtos.OrderDto;
import io.fdlessard.codebites.graphql.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class OrderController {

    private final OrderService orderService;

    @QueryMapping
    public OrderDto findOrderById(@Argument Long id) {
        return orderService.findOrderById(id);
    }

}
