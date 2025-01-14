package stmail.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmail.config.kafka.KafkaProcessor;
import stmail.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DliveryStarted'"
    )
    public void wheneverDliveryStarted_UpdateOrderStatus(
        @Payload DliveryStarted dliveryStarted
    ) {
        DliveryStarted event = dliveryStarted;
        System.out.println(
            "\n\n##### listener UpdateOrderStatus : " + dliveryStarted + "\n\n"
        );

        // Sample Logic //
        Order.updateOrderStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
