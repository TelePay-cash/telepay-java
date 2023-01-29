package cash.telepay;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

/**
 * ResponseInput
 *
 * @author jg123
 */
public class TelePayResponse {

    public JSONObject responseJSON(String baseUrl, String responseType, String secretKey, String endpoint) {
        if ("GET".equals(responseType)) {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(baseUrl + endpoint))
                    .header("accept", "application/json")
                    .header("AUTHORIZATION", secretKey)
                    .method(responseType, HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = null;
            try {
                response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            JSONObject responseObj = new JSONObject(response.body());
            return responseObj;
        }
        if ("POST".equals(responseType)) {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(baseUrl + endpoint))
                    .header("accept", "application/json")
                    .header("AUTHORIZATION", secretKey)
                    .method(responseType, HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = null;
            try {
                response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            JSONObject responseObj = new JSONObject(response.body());
            return responseObj;
        }
        return null;
    }

    @SuppressWarnings("empty-statement")
    public JSONObject responseJSON(String baseUrl, String responseType, String secretKey, String endpoint, String asset, String blockchain, String network) {
        if ("POST".equals(responseType)) {
            try {
                TelePayBodyBuilder parser = new TelePayBodyBuilder();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(baseUrl + endpoint))
                        .header("accept", "application/json")
                        .header("content-type", "application/json")
                        .header("AUTHORIZATION", secretKey)
                        .method("POST", HttpRequest.BodyPublishers.ofString(parser.build(asset, blockchain, network)))
                        .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                JSONObject responseObj = new JSONObject(response.body());
                return responseObj;
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public JSONObject responseJSON(String baseUrl, String responseType, String secretKey, String endpoint, String asset, String blockchain, String network, double amount) {
        if ("POST".equals(responseType)) {
            TelePayBodyBuilder parser = new TelePayBodyBuilder();
            try {

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(baseUrl + endpoint))
                        .header("accept", "application/json")
                        .header("content-type", "application/json")
                        .header("AUTHORIZATION", secretKey)
                        .method(responseType, HttpRequest.BodyPublishers.ofString(parser.build(asset,
                                network,
                                blockchain,
                                amount)))
                        .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                JSONObject responseObj = new JSONObject(response.body());
                return responseObj;
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public JSONObject responseJSON(String baseUrl, String responseType, String secretKey, String endpoint, String invoiceNumber) {
        if ("POST".equals(responseType)) {

            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(baseUrl + endpoint + "/" + invoiceNumber))
                        .header("accept", "application/json")
                        .header("content-type", "application/json")
                        .header("AUTHORIZATION", secretKey)
                        .method(responseType, HttpRequest.BodyPublishers.noBody())
                        .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                JSONObject responseObj = new JSONObject(response.body());
                return responseObj;
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }

    public JSONObject responseJSON(String baseUrl, String responseType, String secretKey, String endpoint, String asset, String blockchain, String network, double amount, String username) {
        if ("POST".equals(responseType)) {

            try {
                TelePayBodyBuilder parser = new TelePayBodyBuilder();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(baseUrl + endpoint))
                        .header("accept", "application/json")
                        .header("content-type", "application/json")
                        .header("AUTHORIZATION", secretKey)
                        .method(responseType, HttpRequest.BodyPublishers.ofString(parser.build(asset, blockchain, network, amount, username)))
                        .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                JSONObject responseObj = new JSONObject(response.body());
                return responseObj;
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }

    public JSONObject responseJSONWithdraw(String baseUrl, String responseType, String secretKey, String endpoint, String asset, String blockchain, String network, double amount, String toAddress) {
        if ("POST".equals(responseType)) {
            try {
                TelePayBodyBuilder parser = new TelePayBodyBuilder();
                HttpRequest.Builder builder = HttpRequest.newBuilder();
                builder.uri(URI.create(baseUrl + endpoint));
                builder.header("accept", "application/json");
                builder.header("content-type", "application/json");
                builder.header("AUTHORIZATION", secretKey);
                builder.method(responseType, HttpRequest.BodyPublishers.ofString(parser.build(asset, blockchain, network, toAddress, amount)));
                HttpRequest request = builder
                        .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                JSONObject responseObj = new JSONObject(response.body());
                return responseObj;
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }
}
   
