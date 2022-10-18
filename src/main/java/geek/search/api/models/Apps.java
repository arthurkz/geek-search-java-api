package geek.search.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Apps {

    @JsonProperty("appid")
    private String appId;

    @JsonProperty("name")
    private String name;
}
