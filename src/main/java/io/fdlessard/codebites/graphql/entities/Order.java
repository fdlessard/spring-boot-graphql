package io.fdlessard.codebites.graphql.entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Table(name = "order")
@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends BaseEntity implements Serializable {

    @NotBlank(message = "description cannot be blank")
    @Size(min = 2, message = "description must have more than 2 characters")
    private String description;

    @NotBlank(message = "date cannot be blank")
    private String date;

    @Valid
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Customer customer;

}
