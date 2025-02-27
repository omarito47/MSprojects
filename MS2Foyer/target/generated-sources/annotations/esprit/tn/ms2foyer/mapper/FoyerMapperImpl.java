package esprit.tn.ms2foyer.mapper;

import esprit.tn.ms2foyer.entity.Foyer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tn.starter.mongoShared.dto.FoyerDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T19:39:32+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class FoyerMapperImpl implements FoyerMapper {

    @Override
    public Foyer toEntity(FoyerDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Foyer foyer = new Foyer();

        foyer.setId( arg0.id() );
        foyer.setName( arg0.name() );
        foyer.setLocation( arg0.location() );
        foyer.setCapacity( arg0.capacity() );

        return foyer;
    }

    @Override
    public FoyerDTO toDto(Foyer arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String id = null;
        String name = null;
        String location = null;
        int capacity = 0;

        id = arg0.getId();
        name = arg0.getName();
        location = arg0.getLocation();
        capacity = arg0.getCapacity();

        FoyerDTO foyerDTO = new FoyerDTO( id, name, location, capacity );

        return foyerDTO;
    }

    @Override
    public List<FoyerDTO> toListDto(List<Foyer> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<FoyerDTO> list = new ArrayList<FoyerDTO>( arg0.size() );
        for ( Foyer foyer : arg0 ) {
            list.add( toDto( foyer ) );
        }

        return list;
    }
}
