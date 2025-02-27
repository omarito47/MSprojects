package esprit.tn.ms1etudiant.feignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.starter.shared.dto.FoyerDTO;

//@FeignClient(name="foyers",url = "http://localhost:8081")
@FeignClient(name="MS2FOYER")

public interface FoyerClient {
    @GetMapping("/api/foyers/getById/{id}")
    //@CircuitBreaker(name="")
    FoyerDTO findById(@PathVariable("id") String id);
}
