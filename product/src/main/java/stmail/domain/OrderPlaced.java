package stmail.domain;

import java.util.*;
import lombok.*;
import stmail.domain.*;
import stmail.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private String address;
    private Long prductid;
    private Integer qty;
    private String status;
}
