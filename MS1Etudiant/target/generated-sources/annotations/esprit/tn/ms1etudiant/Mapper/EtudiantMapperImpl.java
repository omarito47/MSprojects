package esprit.tn.ms1etudiant.Mapper;

import esprit.tn.ms1etudiant.entity.Etudiant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tn.starter.shared.dto.EtudiantDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T19:39:09+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class EtudiantMapperImpl implements EtudiantMapper {

    @Override
    public Etudiant toEntity(EtudiantDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Etudiant etudiant = new Etudiant();

        etudiant.setName( arg0.name() );
        etudiant.setEmail( arg0.email() );
        etudiant.setPhone( arg0.phone() );

        return etudiant;
    }

    @Override
    public EtudiantDTO toDto(Etudiant arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String phone = null;

        id = arg0.getId();
        name = arg0.getName();
        email = arg0.getEmail();
        phone = arg0.getPhone();

        EtudiantDTO etudiantDTO = new EtudiantDTO( id, name, email, phone );

        return etudiantDTO;
    }

    @Override
    public List<EtudiantDTO> toListDto(List<Etudiant> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<EtudiantDTO> list = new ArrayList<EtudiantDTO>( arg0.size() );
        for ( Etudiant etudiant : arg0 ) {
            list.add( toDto( etudiant ) );
        }

        return list;
    }
}
