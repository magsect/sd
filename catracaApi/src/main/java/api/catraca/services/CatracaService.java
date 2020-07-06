package api.catraca.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import api.catraca.model.CatracaEntity;
import api.catraca.rabbit.CatracaFact;

@Service
public class CatracaService {

    @Autowired
    private CatracaService catracaRepository;

    @Autowired
    private CatracaFact catracaFact;

    public void sendImageRabbit(CatracaEntity catraca){
    	System.out.println("---------metodo sendImageRabbit");
    	catracaFact.send(catraca);
    }
    

    public void save(CatracaEntity catraca){
    	System.out.println("-----1");
        catracaRepository.save(catraca);
    }

    public Optional<CatracaEntity> findById(int id){
    	System.out.println("------entrou find()");
        return catracaRepository.findById(id);
    }

    public void deleteAll(){
    	System.out.println("------entrou deleteAll()");
        catracaRepository.deleteAll();
    }
    
}