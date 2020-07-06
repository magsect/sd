package api.catraca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import api.catraca.model.CatracaEntity;
import api.catraca.model.CrachaEntity;
import api.catraca.services.CatracaService;
import api.catraca.services.CrachaService;

import java.util.Optional;

@RestController
public class CatracaController {
	//add trace.entry e exit
	
    @Autowired
    private CrachaService crachaService;

    @PostMapping("api/")
    public void save(@RequestBody CrachaEntity c){
    	//Trace.entry();
    	System.out.println("-------entrou postmap cracha-------");
        crachaService.sendTagRabbit(c);
    }

    @GetMapping("api/{id}")
    public Optional<CrachaEntity> findById(@PathVariable("id") String id){
    	System.out.println("-------entrou GetMap cracha-------");
        return crachaService.findById(id);
    }

    @Autowired
    private CatracaService catracaService;

    @PostMapping("api/catraca")
    public void save(@RequestBody CatracaEntity catraca){
    	System.out.println("-------entrou postmap catraca-------");
        catracaService.sendImageRabbit(catraca);
    }

    @GetMapping("catraca/{id}")
    public Optional<CatracaEntity> findById(@PathVariable("id") int id){
    	System.out.println("-------entrou getMap catraca-------");
        return catracaService.findById(id);
    }
}
