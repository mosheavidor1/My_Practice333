package Testing3;

import com.google.gson.Gson;
import io.netty.handler.codec.http.HttpObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiPractice {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {


        String url = "Google.com";

        ApiHelp object = new ApiHelp();

        object.setName("Moshe");
        object.setId(5);
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(object);

        HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI(url)).POST(HttpRequest.BodyPublishers.ofString(jsonRequest)).header("s", "s").build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(postResponse.statusCode());
        System.out.println(postResponse.body());


    }
}

