package info.blockchain.wallet.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeeOptions {

    @JsonProperty("regular")
    private long regularFee;

    @JsonProperty("priority")
    private long priorityFee;

    @JsonProperty("limits")
    private FeeLimits limits;

    /**
     * Returns a "regular" fee, which should result in a transaction being included in a block
     * within the next 4-6 hours. The fee is in Satoshis per byte.
     */
    public long getRegularFee() {
        return regularFee;
    }

    /**
     * Returns a "priority" fee, which should result in a transaction being included in a block in
     * an hour or so. The fee is in Satoshis per byte.
     */
    public long getPriorityFee() {
        return priorityFee;
    }

    /**
     * Returns a "priority" fee, which should result in a transaction being included in a block in
     * an hour or so. The fee is in Satoshis per byte.
     */
    public FeeLimits getLimits() {
        return limits;
    }
}
