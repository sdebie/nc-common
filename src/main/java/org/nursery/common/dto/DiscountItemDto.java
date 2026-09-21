package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiscountItemDto {
    private UUID id;
    private UUID discountId;
    private UUID nurseryItemId;
    private String nurseryItemNo;
    private Instant createdAt;
    private Instant updatedAt;
}
