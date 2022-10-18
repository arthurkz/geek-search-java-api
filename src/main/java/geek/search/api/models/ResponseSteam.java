package geek.search.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseSteam {

    @JsonProperty("applist")
    private AppList appLists;
}
