package cash.telepay;

/**
 * Merchant
 * @author jrgf
 */
public class Merchant {

    private final String secretKey;

    public Merchant(String secretKey){
        this.secretKey=secretKey;
    }
    
    public String getSecretKey() {
        return secretKey;
    }

    public String getBaseUrl(){
        return "https://api.telepay.cash/rest/";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Merchant{");
        sb.append("secretKey=").append(secretKey);
        sb.append('}');
        return sb.toString();
    }
}
