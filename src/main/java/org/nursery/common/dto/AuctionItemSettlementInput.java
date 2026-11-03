package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuctionItemSettlementInput {
    private String itemId;
    private String buyerId;
    private BigDecimal soldPrice;
}
