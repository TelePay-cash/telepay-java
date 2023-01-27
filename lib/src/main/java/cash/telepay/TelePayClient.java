package cash.telepay;

import org.json.JSONObject;

/**
 * TelePayClient
 * @author jgrgf
 */
public class TelePayClient {

    private final String baseUrl = "https://api.telepay.cash/rest/";
    private Merchant merchant;

    public TelePayClient(Merchant merchant) {
        this.merchant = merchant;
    }

    public JSONObject getMe() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", merchant.secretKey(), "getMe");
    }

    public JSONObject getBalance() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", merchant.secretKey(), "getBalance");
    }

    public JSONObject getAssets() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", merchant.secretKey(), "getAssets");
    }

    public JSONObject getInvoice(String invoice) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", merchant.secretKey(), "getInvoice/" + invoice);
    }

    public JSONObject getInvoices() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", merchant.secretKey(), "getInvoices");
    }

    public JSONObject getWebhook(String webhookId) {

        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", merchant.secretKey(), "getWebhook/" + webhookId);

    }

    public JSONObject getWebhooks() {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "GET", merchant.secretKey(), "getWebhooks");
    }

    public JSONObject getBalance(String asset, String blockchain, String network) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", merchant.secretKey(), "getBalance", asset, blockchain, network);
    }

    public JSONObject createInvoice(String asset, String blockchain, String network, double amount) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", merchant.secretKey(), "createInvoice", asset, blockchain, network, amount);
    }

    public JSONObject cancelInvoice(String invoiceNumber) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", merchant.secretKey(), "cancelInvoice", invoiceNumber);
    }

    public JSONObject deleteInvoice(String invoiceNumber) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", merchant.secretKey(), "deleteInvoice", invoiceNumber);
    }

    public JSONObject transfer(String asset, String blockchain, String network, float amount, String username) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSON(baseUrl, "POST", merchant.secretKey(), "transfer", asset, blockchain, network, amount, username);
    }

    public JSONObject getWithdrawFee(String asset, String blockchain, String network, float amount, String toAddress) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSONWithdraw(baseUrl, "POST", merchant.secretKey(), "getWithdrawFee", asset, blockchain, network, amount, toAddress);
    }

    public JSONObject withdraw(String asset, String blockchain, String network, float amount, String toAddress) {
        TelePayResponse response = new TelePayResponse();
        return response.responseJSONWithdraw(baseUrl, "POST", merchant.secretKey(), "withdraw", asset, blockchain, network, amount, toAddress);
    }

    public Merchant getMerchant() {
        return merchant;
    }

}
