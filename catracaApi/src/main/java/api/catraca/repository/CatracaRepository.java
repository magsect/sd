package api.catraca.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import api.catraca.model.CatracaEntity;

@Repository
public interface CatracaRepository extends MongoRepository<CatracaEntity, Integer>{
}