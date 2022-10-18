package geek.search.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CountriesResponse {

    @JsonProperty("error")
    private Boolean error;

    @JsonProperty("msg")
    private String msg;

    @JsonProperty("data")
    private List<Countries> contries;

}
