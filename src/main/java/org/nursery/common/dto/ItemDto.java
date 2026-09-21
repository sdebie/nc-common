package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nursery.common.enums.ItemStatusEn;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {
    private UUID id;
    private String itemNo;
    private UUID familyId;
    private ItemFamilyDto family;
    private String description;
    private BigDecimal originalPrice;
    private BigDecimal salePrice;
    private ItemStatusEn status;
    private Integer diameter;
    private Integer availableSequence;
    private String source;
    private Integer sourceRow;
    private MainImageDto mainImage;
    private List<ItemImageDto> images;
    private Instant createdAt;
    private Instant updatedAt;
}
