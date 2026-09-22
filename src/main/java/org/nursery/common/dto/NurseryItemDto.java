package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nursery.common.enums.ItemTypeEn;
import org.nursery.common.enums.ItemStatusEn;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NurseryItemDto {
    private UUID id;
    private String itemNo;
    private UUID familyId;
    private ItemFamilyDto family;
    private String description;
    private BigDecimal originalPrice;
    private BigDecimal effectivePrice;
    private DiscountDto activeDiscount;
    private Integer diameter;
    private Integer availableSequence;
    private String source;
    private Integer sourceRow;
    private Integer quantityInStock;
    private ItemTypeEn itemType;
    private ItemStatusEn itemStatus;
    private MainImageDto mainImage;
    private List<ItemImageDto> images;
    private Instant createdAt;
    private Instant updatedAt;
}
