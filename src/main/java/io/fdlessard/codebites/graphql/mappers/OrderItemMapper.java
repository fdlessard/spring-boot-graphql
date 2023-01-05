package io.fdlessard.codebites.graphql.mappers;

import io.fdlessard.codebites.graphql.dtos.OrderItemDto;
import io.fdlessard.codebites.graphql.entities.OrderItem;

public class OrderItemMapper {

    private OrderItemMapper() {
    }

    public static OrderItemDto map(OrderItem orderItem) {

        if(orderItem == null) {
            return null;
        }

        return OrderItemDto.builder()
                .id(orderItem.getId())
                .productName(orderItem.getProductName())
                .quantity(orderItem.getQuantity())
                .build();
    }
}
