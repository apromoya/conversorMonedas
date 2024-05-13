import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultarMoneda {


    public Moneda buscaMoneda(String base_code, String target_code){
        /*creo una variable con metodo URI y agrego URI.create, la direccion  con dos variables que va agregar */
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/99250521b768a9c0fae5c1a0/pair/" + base_code + "/" + target_code);

        //llamar o conectar con la api
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        /*La verdad no entiendo mucho este lado*/
        /**/
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
                    return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro ninguna informacion.");
        }


    }
}
