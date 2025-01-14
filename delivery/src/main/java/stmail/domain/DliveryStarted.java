package stmail.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmail.domain.*;
import stmail.infra.AbstractEvent;

//<<< DDD / Domain Event
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

    public DliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
