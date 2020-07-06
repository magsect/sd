package api.catraca.services;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import api.catraca.model.CrachaEntity;
import api.catraca.rabbit.CrachaFactory;
import api.catraca.repository.CrachaRepository;

import java.util.Optional;

@Service
public class CrachaService {

    @Autowired
    private CrachaRepository crachaRepository;

    //factory
    @Autowired
    private CrachaFactory crachaFact;

    public void sendTagRabbit(CrachaEntity c){
    	crachaFact.send(c);
    }

    public void save(CrachaEntity c){
    	crachaRepository.save(c);
    }

    public Optional<CrachaEntity> findById(String id){
        return crachaRepository.findById(id);
    }

    public void deleteAll(){
    	crachaRepository.deleteAll();
    }

}
