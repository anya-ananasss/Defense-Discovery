package backend.academy.modelservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PromtDto {
    private String topic;
    private int numQuestions;
    private String difficulty;
    @JsonProperty("key_words")
    private List<String> keyWords;
}

