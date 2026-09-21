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
public class DiscountDto {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal discountPercentage;
    private Instant startDate;
    private Instant endDate;
    private Boolean isActive;
    private List<DiscountItemDto> items;
    private Instant createdAt;
    private Instant updatedAt;
}
