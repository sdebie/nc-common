package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Input;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Input
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountImportRequest {
    private String name;
    private String description;
    private BigDecimal discountPercentage;
    private Instant startDate;
    private Instant endDate;
    private List<UUID> itemIds;
}
