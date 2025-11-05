import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
        Gson gson = new Gson();
        HttpClient cliente = HttpClient.newHttpClient();
        private String moneda1;
        private String moneda2;
        String APIKey = "b8f879dc268c5621a04eccf9";

        public Monedas realizarConsulta() throws IOException, InterruptedException {
            HttpRequest consulta = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/"
                            + APIKey + "/pair/" + moneda1 + "/" + moneda2))
                    .build();
                HttpResponse<String> respuesta = cliente
                        .send(consulta, HttpResponse.BodyHandlers.ofString());
                String json = respuesta.body();
                Monedas monedas = gson.fromJson(json, Monedas.class);
                return monedas;
        }

        public ConsultaAPI() throws IOException, InterruptedException {
        }

        public void setMoneda1(String moneda1) {
            this.moneda1 = moneda1;
        }

        public void setMoneda2(String moneda2) {
            this.moneda2 = moneda2;
        }

        public String getMoneda1() {
            return moneda1;
        }

        public String getMoneda2() {
            return moneda2;
        }
}

