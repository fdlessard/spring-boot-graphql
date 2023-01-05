package io.fdlessard.codebites.graphql.services;

import io.fdlessard.codebites.graphql.dtos.OrderDto;
import io.fdlessard.codebites.graphql.mappers.OrderMapper;
import io.fdlessard.codebites.graphql.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderDto findOrderById(Long id) {

        var order = orderRepository.findById(id);

        return order
                .map(OrderMapper::map)
                .orElse(null);

    }

}
