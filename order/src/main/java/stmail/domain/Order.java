package stmail.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import stmail.OrderApplication;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String productName;

    private String address;

    private Long prductId;

    private Integer qty;

    private String status;

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateOrderStatus(DliveryStarted dliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        OrderStatusUpdate orderStatusUpdate = new OrderStatusUpdate(order);
        orderStatusUpdate.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if dliveryStarted.cjLogisId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> deliveryMap = mapper.convertValue(dliveryStarted.getCjLogisId(), Map.class);

        repository().findById(dliveryStarted.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);

            OrderStatusUpdate orderStatusUpdate = new OrderStatusUpdate(order);
            orderStatusUpdate.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
