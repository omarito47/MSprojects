package esprit.tn.ms2foyer.repository;


import esprit.tn.ms2foyer.entity.Foyer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.starter.mongoShared.repositories.BaseRepository;

@Repository
public interface FoyerRepository extends BaseRepository<Foyer, String> {
}
