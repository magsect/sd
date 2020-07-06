package api.catraca.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import api.catraca.model.CrachaEntity;

@Repository
public interface CrachaRepository extends MongoRepository<CrachaEntity, String> {
}
