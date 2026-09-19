package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nursery.common.enums.ItemStatusEn;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NurseryItemDto {
    private UUID id;
    private String itemNo;
    private String description;
    private BigDecimal originalPrice;
    private BigDecimal salePrice;
    private ItemStatusEn status;
    private Integer diameter;
    private Integer availableSequence;
    private String source;
    private Integer sourceRow;
    private Instant createdAt;
    private Instant updatedAt;
}
