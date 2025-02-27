package esprit.tn.ms2foyer.controller;




import esprit.tn.ms2foyer.entity.Foyer;
import esprit.tn.ms2foyer.service.IFoyerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.starter.mongoShared.controllers.GenericController;
import tn.starter.mongoShared.dto.FoyerDTO;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/foyers")
@RequiredArgsConstructor
public class FoyerController extends GenericController<FoyerDTO> {

}
