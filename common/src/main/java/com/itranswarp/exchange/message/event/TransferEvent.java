package com.itranswarp.exchange.message.event;

import com.itranswarp.exchange.enums.AssetEnum;

import java.math.BigDecimal;

/**
 * Transfer between users.
 */
public class TransferEvent extends AbstractEvent {

    public Long fromUserId;
    public Long toUserId;
    public AssetEnum asset;
    public BigDecimal amount;
    public boolean sufficient;

    @Override
    public String toString() {
        return "TransferEvent [sequenceId=" + sequenceId + ", previousId=" + previousId + ", uniqueId=" + uniqueId
                + ", refId=" + refId + ", createdAt=" + createdAt + ", fromUserId=" + fromUserId + ", toUserId="
                + toUserId + ", asset=" + asset + ", amount=" + amount + ", sufficient=" + sufficient + "]";
    }
}
