package io.fdlessard.codebites.graphql.dtos;

import io.fdlessard.codebites.graphql.entities.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto  implements Serializable {

    private Long id;
    private String description;
    private String date;

    private CustomerDto customer;
    private List<OrderItemDto> items;

}
