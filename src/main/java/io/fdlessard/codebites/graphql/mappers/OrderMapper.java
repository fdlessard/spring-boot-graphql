package io.fdlessard.codebites.graphql.mappers;

import io.fdlessard.codebites.graphql.dtos.OrderDto;
import io.fdlessard.codebites.graphql.entities.Order;

public class OrderMapper {

    private OrderMapper() {
    }

    public static OrderDto map(Order order) {

        if(order == null) {
            return null;
        }

        return OrderDto.builder()
                .id(order.getId())
                .description(order.getDescription())
                .date(order.getDate())
                .customer(CustomerMapper.map(order.getCustomer()))
                .build();
    }
}
