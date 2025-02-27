package esprit.tn.ms2foyer.mapper;

import esprit.tn.ms2foyer.entity.Foyer;
import org.mapstruct.Mapper;
import tn.starter.mongoShared.dto.FoyerDTO;
import tn.starter.mongoShared.mappers.GenericMapper;
@Mapper(componentModel = "spring")
public interface FoyerMapper extends GenericMapper<FoyerDTO,Foyer> {
}
