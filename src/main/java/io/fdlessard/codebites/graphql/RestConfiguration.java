package io.fdlessard.codebites.graphql;

import io.fdlessard.codebites.graphql.entities.Address;
import io.fdlessard.codebites.graphql.entities.Customer;
import io.fdlessard.codebites.graphql.entities.Order;
import io.fdlessard.codebites.graphql.entities.OrderItem;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Address.class);
        config.exposeIdsFor(Customer.class);
        config.exposeIdsFor(Order.class);
        config.exposeIdsFor(OrderItem.class);
    }
}
