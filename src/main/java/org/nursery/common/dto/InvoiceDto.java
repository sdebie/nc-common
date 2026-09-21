package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDto {
    private UUID id;
    private String invoiceNo;
    private Instant invoiceDate;
    private BigDecimal totalAmount;
    private String status;
    private Instant paidAt;
    private String notes;
    private List<InvoiceItemDto> items;
    private Instant createdAt;
    private Instant updatedAt;
}
