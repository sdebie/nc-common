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
public class InvoiceItemDto {
    private UUID id;
    private UUID invoiceId;
    private UUID nurseryItemId;
    private NurseryItemDto nurseryItem;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
    private BigDecimal discountPercentage;
    private BigDecimal discountedPrice;
    private Instant createdAt;
    private Instant updatedAt;
}
