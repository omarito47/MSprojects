package esprit.tn.ms1etudiant.Mapper;

import esprit.tn.ms1etudiant.entity.Etudiant;
import org.mapstruct.Mapper;
import tn.starter.shared.dto.EtudiantDTO;
import tn.starter.shared.mapper.GenericMapper;
@Mapper(componentModel = "spring")

public interface EtudiantMapper extends GenericMapper<EtudiantDTO, Etudiant> {
}
