package labshopkeycloak.domain;

import java.util.*;
import labshopkeycloak.domain.*;
import labshopkeycloak.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}
