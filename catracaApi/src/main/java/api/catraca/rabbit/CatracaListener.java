package api.catraca.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import api.catraca.model.CatracaEntity;
import api.catraca.services.CatracaService;

@Component
public class CatracaListener {
    @Autowired
    private CatracaService catracaService;

    @RabbitListener(queues = {"${queueL}"})
    public void receive (@Payload CatracaEntity Catraca){
    	System.out.println("-----------Listener Catraca service");
        catracaService.save(Catraca);
    }
}