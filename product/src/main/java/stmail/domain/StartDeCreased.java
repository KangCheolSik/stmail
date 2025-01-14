package stmail.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmail.domain.*;
import stmail.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StartDeCreased extends AbstractEvent {

    private Long id;

    public StartDeCreased(Inventory aggregate) {
        super(aggregate);
    }

    public StartDeCreased() {
        super();
    }
}
//>>> DDD / Domain Event
