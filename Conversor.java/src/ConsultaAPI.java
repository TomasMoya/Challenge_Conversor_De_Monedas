import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Consulta {
        Gson gson = new Gson();
        HttpClient cliente = HttpClient.newHttpClient();
        int moneda1;
        int moneda2;
        String APIKey = "b8f879dc268c5621a04eccf9";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"
                        + APIKey + "/pair/" + moneda1 + "/" + moneda2))
                .build();
    }

