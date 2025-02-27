package esprit.tn.ms1etudiant.repository;

import esprit.tn.ms1etudiant.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.starter.shared.repository.BaseRepository;

public interface EtudiantRepository extends BaseRepository<Etudiant, Long> {
}
