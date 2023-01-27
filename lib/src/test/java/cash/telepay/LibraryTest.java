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
        assertTrue(response.get("version") != null);
    }

    // TODO: test the other endpoints

}
