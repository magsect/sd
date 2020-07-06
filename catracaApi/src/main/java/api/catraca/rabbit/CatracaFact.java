package api.catraca.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import api.catraca.model.CatracaEntity;

@Component
public class CatracaFact {
    @Autowired
    private RabbitTemplate rabbit;

    @Qualifier("queueF")
    @Autowired
    private Queue qf;

    public void send(CatracaEntity Catraca){
    	System.out.println("------Rabbit catraca entity"+qf.getName());
    	rabbit.convertAndSend(this.qf.getName(), Catraca);
    }
}