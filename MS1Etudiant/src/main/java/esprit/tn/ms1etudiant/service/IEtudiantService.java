package esprit.tn.ms1etudiant.service;


import esprit.tn.ms1etudiant.entity.Etudiant;
import tn.starter.shared.dto.EtudiantDTO;
import tn.starter.shared.dto.FoyerDTO;
import tn.starter.shared.service.IGenericService;

import java.util.List;
import java.util.Optional;


public interface IEtudiantService extends IGenericService<EtudiantDTO> {
    FoyerDTO getFoyerById(String id);

}

