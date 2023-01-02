package io.fdlessard.codebites.graphql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Table(name = "order_item")
@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends BaseEntity implements Serializable {

    @NotBlank(message = "product name cannot be blank")
    @Size(min = 2, message = "product name must have more than 2 characters")
    private String productName;

    private int quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    private Order order;
}
