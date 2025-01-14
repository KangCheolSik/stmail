package stmail.domain;

import java.util.*;
import lombok.*;
import stmail.domain.*;
import stmail.infra.AbstractEvent;

@Data
@ToString
public class DliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long productid;
    private Long productname;
    private Integer qty;
    private String address;
    private String status;
}
