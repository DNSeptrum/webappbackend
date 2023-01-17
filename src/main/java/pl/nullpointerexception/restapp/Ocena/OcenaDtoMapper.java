package pl.nullpointerexception.restapp.Ocena;


import org.springframework.stereotype.Service;

@Service
public class OcenaDtoMapper {


    public NewOcenaDto map(Ocena ocena) {
        NewOcenaDto dto= new NewOcenaDto();
        dto.setId(ocena.getId());
        dto.setType(ocena.getType());
        dto.setValue(ocena.getValue());
        dto.setTaskID(ocena.getTaskID());
        dto.setData(ocena.getData());
        dto.setScore(ocena.getScore());
        return dto;
    }

    Ocena map(NewOcenaDto dto) {
        Ocena ocena = new Ocena();
        ocena.setId(dto.getId());
        ocena.setType(dto.getType());
        ocena.setValue(dto.getValue());
        ocena.setTaskID(dto.getTaskID());
        ocena.setData(dto.getData());
        ocena.setScore(dto.getScore());

        return ocena;
    }
}
