package api.catraca.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import api.catraca.model.CrachaEntity;

@Component
public class CrachaFactory {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Qualifier("queueC")
    @Autowired
    private Queue queueC;

    public void send(CrachaEntity c){
    	System.out.println("-------rabbut Cracha entity " +queueC.getName());
        rabbitTemplate.convertAndSend(this.queueC.getName(), c);
    }
} 
