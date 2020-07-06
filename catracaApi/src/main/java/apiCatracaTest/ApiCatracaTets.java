package apiCatracaTest;

import api.catraca.MyApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import api.catraca.model.CatracaEntity;
import api.catraca.model.CrachaEntity;
import api.catraca.services.CatracaService;
import api.catraca.services.CrachaService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class)
@WebAppConfiguration
public class ApiCatracaTets {
	//--------------------
    @Autowired
    private CrachaService crachaService;
    @Autowired
    private CatracaService catracaService;
    public void save() throws Exception {

        long elem = 600;
        catracaService.deleteAll();
        String pattern = "MM/dd/yyyy HH:mm:ss";
        crachaService.deleteAll();

        for (int i = 1; i <= elem ; i++){
            crachaService.sendTagRabbit(new CrachaEntity(i));
            //DateTimeToString - data de entrada / data de saida
            System.out.println("-------aqui 1");
            catracaService.sendImageRabbit(new CatracaEntity(i, "05/05/2015 08:00:00", "05/05/2015 18:00:00", i+1, i+2));
            System.out.println("Aqui 2");
            System.out.println("-------------------->"+i);
        }


    }

}
