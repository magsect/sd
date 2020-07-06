package api.catraca.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import api.catraca.model.CrachaEntity;
import api.catraca.services.CrachaService;

@Component
public class CrachaListener {

    @Autowired
    private CrachaService crachaService;

    @RabbitListener(queues = {"${queueCrac}"})
    public void receive (@Payload CrachaEntity crachaEntity){
    	System.out.println(".............Listener Cracha service");
    	crachaService.save(crachaEntity);
    }
} 
