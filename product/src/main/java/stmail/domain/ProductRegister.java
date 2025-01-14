package stmail.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmail.domain.*;
import stmail.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductRegister extends AbstractEvent {

    private Long id;

    public ProductRegister(Inventory aggregate) {
        super(aggregate);
    }

    public ProductRegister() {
        super();
    }
}
//>>> DDD / Domain Event
