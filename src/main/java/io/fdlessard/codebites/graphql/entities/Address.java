package io.fdlessard.codebites.graphql.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import java.io.Serializable;

@Table(name = "address")
@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address extends BaseEntity implements Serializable {

    @NotBlank(message = "number name cannot be blank")
    @Column(name = "number")
    private String number;

    @NotBlank(message = "street name cannot be blank")
    @Size(min = 2, message = "street must have more thant 2 characters")
    @Column(name = "street")
    private String street;

    @NotBlank(message = "city name cannot be blank")
    @Size(min = 2, message = "city must have more thant 2 characters")
    @Column(name = "city")
    private String city;

    @NotBlank(message = "postalCode name cannot be blank")
    @Size(min = 2, message = "postalCode must have more thant 2 characters")
    @Column(name = "postal_code")
    private String postalCode;

    @NotBlank(message = "province name cannot be blank")
    @Size(min = 2, message = "province must have more thant 2 characters")
    @Column(name = "province")
    private String province;

    @NotBlank(message = "country name cannot be blank")
    @Size(min = 2, message = "country must have more thant 2 characters")
    @Column(name = "country")
    private String country;

    @ToString.Exclude
    @JsonIgnoreProperties("addresses")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
}


