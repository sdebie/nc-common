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

    // Item details (stored as snapshots on auction_item)
    private String itemNo;
    private String itemDescription;
    private BigDecimal itemDiameter;
    private BigDecimal itemHeight;
    private BigDecimal itemOriginalPrice;

    // Auction-specific pricing
    private BigDecimal startingPrice;
    private BigDecimal soldPrice;
    private BigDecimal estimatedPrice;
    private BigDecimal reservePrice;

    private String note;

    // Winning bidder information
    private AuctionParticipantDto winningBidder;

    private Instant createdAt;
    private Instant updatedAt;
}
