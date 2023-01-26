package cash.telepay;


import org.json.JSONObject;



/**
 *
 * @author jgrgf
 */




public class TelepayClient {
    private Merchant merchant;
    public TelepayClient(Merchant merchant){
        this.merchant=merchant;
    }
    
    public JSONObject getMe(){
        ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"GET", merchant.getSecretKey(),"getMe");
     
    }
    public JSONObject getBalance(){
        ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"GET", merchant.getSecretKey(),"getBalance");
    }
public JSONObject getAssets(){
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"GET", merchant.getSecretKey(),"getAssets");
         
    }
public JSONObject getInvoice(String invoice){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"GET", merchant.getSecretKey(),"getInvoice/"+invoice);
     
    }
public JSONObject getInvoices(){
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"GET", merchant.getSecretKey(),"getInvoices");
    }

public JSONObject getWebhook(String webhookId){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"GET", merchant.getSecretKey(),"getWebhook/"+webhookId);
     
    }
public JSONObject getWebhooks(){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"GET", merchant.getSecretKey(),"getWebhooks");
     
    }
public JSONObject getBalance(String asset,String blockchain,String network){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"POST", merchant.getSecretKey(),"getBalance",asset,blockchain,network);
     
    }
public JSONObject createInvoice(String asset,String blockchain,String network,double amount){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"POST", merchant.getSecretKey(),"createInvoice",asset,blockchain,network,amount);
     
    }
public JSONObject cancelInvoice(String invoiceNumber){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"POST", merchant.getSecretKey(),"cancelInvoice",invoiceNumber);
     
    }
public JSONObject deleteInvoice(String invoiceNumber){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"POST", merchant.getSecretKey(),"deleteInvoice",invoiceNumber);
     
    }
public JSONObject transfer(String asset,String blockchain,String network,float amount,String username){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSON(merchant.getBaseUrl(),"POST", merchant.getSecretKey(),"transfer",asset,blockchain,network,amount,username);
     
    }
public JSONObject getWithdrawFee(String asset,String blockchain,String network,float amount,String toAddress){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSONWithdraw(merchant.getBaseUrl(),"POST", merchant.getSecretKey(),"getWithdrawFee",asset,blockchain,network,amount,toAddress);
     
}
public JSONObject withdraw(String asset,String blockchain,String network,float amount,String toAddress){
     
     ResponseInput response = new ResponseInput();
        return response.responseJSONWithdraw(merchant.getBaseUrl(),"POST", merchant.getSecretKey(),"withdraw",asset,blockchain,network,amount,toAddress);
     
    }

//Class Getter
public Merchant getMerchant() {
        return merchant;
    }

    
    
}
