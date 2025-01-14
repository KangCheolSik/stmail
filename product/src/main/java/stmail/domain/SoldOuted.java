package stmail.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmail.domain.*;
import stmail.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SoldOuted extends AbstractEvent {

    private Long id;

    public SoldOuted(Inventory aggregate) {
        super(aggregate);
    }

    public SoldOuted() {
        super();
    }
}
//>>> DDD / Domain Event
