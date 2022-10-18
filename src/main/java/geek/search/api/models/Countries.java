package geek.search.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Countries {

    @JsonProperty("iso2")
    private String iso2;

    @JsonProperty("iso3")
    private String iso3;

    @JsonProperty("country")
    private String country;

    @JsonProperty("cities")
    private List<String> cities;
}
