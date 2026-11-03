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
public class CreditNoteDto {
    private UUID id;
    private String creditNoteNo;
    private UUID userId;
    private UserDto user;
    private UUID returnRequestId;
    private ReturnRequestDto returnRequest;
    private BigDecimal creditAmount;
    private Instant issueDate;
    private String reason;
    private Instant createdAt;
    private Instant updatedAt;
}
