package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReturnItemDto {
    private UUID id;
    private UUID invoiceItemId;
    private Integer quantityReturned;
    private BigDecimal unitPrice;
    private BigDecimal totalReturnAmount;
    private Instant createdAt;
    private Instant updatedAt;
}
