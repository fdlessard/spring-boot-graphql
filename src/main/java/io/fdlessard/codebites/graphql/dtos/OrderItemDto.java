package io.fdlessard.codebites.graphql.dtos;

import io.fdlessard.codebites.graphql.entities.BaseEntity;
import io.fdlessard.codebites.graphql.entities.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto implements Serializable {

    private Long id;
    private String productName;
    private int quantity;
    private Order order;
}
