package pl.nullpointerexception.restapp.Answer;

import org.springframework.stereotype.Service;


@Service
public class AnswerDtoMapper {

    public NewAnswerDto map(Answer answer) {
        NewAnswerDto dto= new NewAnswerDto();
        dto.setId(answer.getId());
        dto.setAnswer(answer.getAnswer());
        return dto;
    }

    Answer map(NewAnswerDto dto) {
        Answer answer = new Answer();
        answer.setId(dto.getId());
        answer.setAnswer(dto.getAnswer());
        return answer;
    }
}
