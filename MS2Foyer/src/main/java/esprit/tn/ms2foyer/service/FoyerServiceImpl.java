package esprit.tn.ms2foyer.service;



import esprit.tn.ms2foyer.entity.Foyer;
import esprit.tn.ms2foyer.repository.FoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.starter.mongoShared.dto.FoyerDTO;
import tn.starter.mongoShared.services.IGenericServiceImpl;

import java.util.List;
import java.util.Optional;

@Service
public class FoyerServiceImpl extends IGenericServiceImpl<FoyerDTO,Foyer> implements IFoyerService {


}

