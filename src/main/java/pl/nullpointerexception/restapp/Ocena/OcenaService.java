package pl.nullpointerexception.restapp.Ocena;


import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OcenaService {

    private final OcenaRepository ocenaRepository;
    private final OcenaDtoMapper ocenaDtoMapper;

    public OcenaService(OcenaRepository ocenaRepository, OcenaDtoMapper ocenaDtoMapper) {
        this.ocenaRepository = ocenaRepository;
        this.ocenaDtoMapper = ocenaDtoMapper;
    }


    Optional<NewOcenaDto> getOcenaById(Long id) {
        return ocenaRepository.findById(id)
                .map(ocenaDtoMapper::map);
    }

    public NewOcenaDto saveOcena(NewOcenaDto OcenaDto) {
        Ocena ocenaToSave = ocenaDtoMapper.map(OcenaDto);
        Ocena savedOcena = ocenaRepository.save(ocenaToSave);
        return ocenaDtoMapper.map(savedOcena);
    }
}
