package esprit.tn.ms1etudiant.controller;


import esprit.tn.ms1etudiant.entity.Etudiant;
import esprit.tn.ms1etudiant.service.IEtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.starter.shared.controller.GenericController;
import tn.starter.shared.dto.EtudiantDTO;
import tn.starter.shared.dto.FoyerDTO;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")
@RequiredArgsConstructor
public class EtudiantController extends GenericController<EtudiantDTO> {
    private final IEtudiantService etudiantService;
    @GetMapping("/GetFoyerById/{id}")
    public FoyerDTO getFoyerById(@PathVariable String id) {
        return etudiantService.getFoyerById(id);
    }
}
