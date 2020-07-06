package api.catraca;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication {
 //addBeans fila rabb
	//add trace.entry / trace.exit p metodos.
    @Value("${queue}")
    private String queue;
	    //
    @Bean
    public Queue queue(){
    	System.out.println("----quue");
        return new Queue(queue, true);
    }
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);     
        System.out.println("----------foi");
    }
    



}