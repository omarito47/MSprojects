package esprit.tn.ms1etudiant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableFeignClients
public class Ms1EtudiantApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ms1EtudiantApplication.class, args);
    }

}
