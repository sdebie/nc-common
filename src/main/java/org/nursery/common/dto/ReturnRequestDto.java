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
public class ReturnRequestDto {
    private UUID id;
    private String returnNo;
    private UUID invoiceId;
    private String status;
    private Instant returnDate;
    private Instant approvalDate;
    private String reason;
    private BigDecimal totalReturnAmount;
    private List<ReturnItemDto> items;
    private Instant createdAt;
    private Instant updatedAt;
}
