import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversionAPI {

    public ConversorMoneda moneda(String monedaIngreso, String monedaSalida){
    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/bc878f0ced7c43bff8d124c4/pair/" + monedaIngreso
            + "/" + monedaSalida);


        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConversorMoneda.class);
        }catch (Exception e){
            throw new RuntimeException("no encontre esa moneda en mi base de datos");
        }
    }
}
