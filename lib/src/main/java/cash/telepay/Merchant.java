package cash.telepay;

/**
 * Merchant
 *
 * @author jrgf
 */
public record Merchant(String secretKey) {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Merchant{");
        sb.append("secretKey=").append(secretKey);
        sb.append('}');
        return sb.toString();
    }
}
