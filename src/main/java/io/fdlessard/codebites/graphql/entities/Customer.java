package io.fdlessard.codebites.graphql.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Table(name = "customer")
@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity implements Serializable {

    @NotBlank(message = "lastName name cannot be blank")
    @Size(min = 2, message = "lastName must have more thant 2 characters")
    private String lastName;

    @NotBlank(message = "firstName name cannot be blank")
    @Size(min = 2, message = "firstName must have more thant 2 characters")
    private String firstName;

    @NotBlank(message = "company name cannot be blank")
    @Size(min = 2, message = "company must have more thant 2 characters")
    private String company;

    @Valid
    @JsonIgnoreProperties("customer")
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses;

    @ToString.Exclude
    @Valid
    @OneToOne(mappedBy = "customer")
    private Order order;

}

