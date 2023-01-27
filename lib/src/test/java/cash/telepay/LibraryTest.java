package cash.telepay;

import org.json.JSONObject;
import org.junit.Test;
import static org.junit.Assert.*;


public class LibraryTest {

    private final String apiKey = System.getenv("TELEPAY_SECRET_API_KEY");
    private final TelePayClient client = new TelePayClient(apiKey);

    @Test public void testApiKey() {
        assertNotEquals(apiKey, null);
    }

    @Test public void getMe() {
        JSONObject response = client.getMe();
        assertNotNull(response.get("version"));
    }

    // TODO: test the other endpoints
    @Test public void getBalance(){
        JSONObject response = client.getBalance();
        assertNotNull(response.get("wallets"));
    }
    @Test public void getAssets(){
        JSONObject response = client.getAssets();
        assertNotNull(response.get("assets"));
    }
    @Test public  void getInvoices(){
        JSONObject response = client.getInvoices();
        assertNotNull(response.get("invoices"));
    }
    @Test public void getWebhooks(){
        JSONObject response = client.getWebhooks();
        assertNotNull(response.get("webhooks"));
    }

}
