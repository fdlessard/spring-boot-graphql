package io.fdlessard.codebites.graphql.services;

import io.fdlessard.codebites.graphql.dtos.OrderItemDto;
import io.fdlessard.codebites.graphql.mappers.OrderItemMapper;
import io.fdlessard.codebites.graphql.repositories.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemDto findOrderById(Long id) {

        return orderItemRepository.findById(id)
                .map(OrderItemMapper::map)
                .orElse(null);

    }

}
