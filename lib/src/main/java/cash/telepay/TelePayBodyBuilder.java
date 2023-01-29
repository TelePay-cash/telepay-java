package cash.telepay;

import org.json.JSONObject;

public class TelePayBodyBuilder {

    public String build(String asset, String blockchain, String network) {
        JSONObject object = new JSONObject();
        object.put("asset", asset);
        object.put("blockchain", blockchain);
        object.put("network", network);
        return object.toString();
    }

    public String build(String asset, String blockchain, String network, double amount) {
        JSONObject object = new JSONObject();
        object.put("asset", asset);
        object.put("blockchain", blockchain);
        object.put("network", network);
        object.put("expires_at", 600);
        object.put("amount", amount);
        return object.toString();
    }

    public String build(String asset, String blockchain, String network, double amount, String username) {
        JSONObject object = new JSONObject();
        object.put("asset", asset);
        object.put("blockchain", blockchain);
        object.put("network", network);
        object.put("amount", amount);
        object.put("username", username);
        return object.toString();
    }

    public String build(String asset, String blockchain, String network, String to_address, double amount) {
        JSONObject object = new JSONObject();
        object.put("asset", asset);
        object.put("blockchain", blockchain);
        object.put("network", network);
        object.put("to_address", to_address);
        object.put("amount", amount);
        return object.toString();
    }
}
