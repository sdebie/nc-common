package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuctionItemDto {
    private UUID id;
    private UUID auctionId;
    private UUID nurseryItemId;
    private NurseryItemDto nurseryItem;
    private BigDecimal startingPrice;
    private BigDecimal currentBid;
    private BigDecimal estimatedPrice;
    private BigDecimal reservePrice;
    private Instant createdAt;
    private Instant updatedAt;
}
