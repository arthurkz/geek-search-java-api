package geek.search.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AppList {

    @JsonProperty("apps")
    private List<Apps> apps;
}
