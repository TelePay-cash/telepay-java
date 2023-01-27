package cash.telepay;

import org.json.JSONObject;

/**
 * TelePayClient
 * @author jgrgf
 */
public class TelePayClient {

    private final String baseUrl = "https://api.telepay.cash/rest/";
    private String secretApiKey;

    public TelePayClient(String secretApiKey) {
        this.secretApiKey = secretApiKey;
    }

    public JSONObject getMe() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", secretApiKey, "getMe");
    }

    public JSONObject getBalance() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", secretApiKey, "getBalance");
    }

    public JSONObject getAssets() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", secretApiKey, "getAssets");
    }

    public JSONObject getInvoice(String invoice) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", secretApiKey, "getInvoice/" + invoice);
    }

    public JSONObject getInvoices() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", secretApiKey, "getInvoices");
    }

    public JSONObject getWebhook(String webhookId) {

        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", secretApiKey, "getWebhook/" + webhookId);

    }

    public JSONObject getWebhooks() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", secretApiKey, "getWebhooks");
    }

    public JSONObject getBalance(String asset, String blockchain, String network) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", secretApiKey, "getBalance", asset, blockchain, network);
    }

    public JSONObject createInvoice(String asset, String blockchain, String network, double amount) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", secretApiKey, "createInvoice", asset, blockchain, network, amount);
    }

    public JSONObject cancelInvoice(String invoiceNumber) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", secretApiKey, "cancelInvoice", invoiceNumber);
    }

    public JSONObject deleteInvoice(String invoiceNumber) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", secretApiKey, "deleteInvoice", invoiceNumber);
    }

    public JSONObject transfer(String asset, String blockchain, String network, float amount, String username) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", secretApiKey, "transfer", asset, blockchain, network, amount, username);
    }

    public JSONObject getWithdrawFee(String asset, String blockchain, String network, float amount, String toAddress) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSONWithdraw(baseUrl, "POST", secretApiKey, "getWithdrawFee", asset, blockchain, network, amount, toAddress);
    }

    public JSONObject withdraw(String asset, String blockchain, String network, float amount, String toAddress) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSONWithdraw(baseUrl, "POST", secretApiKey, "withdraw", asset, blockchain, network, amount, toAddress);
    }

}
