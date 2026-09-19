package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Input;
import org.nursery.common.enums.ItemStatusEn;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Input
public class FilterRequest {
    private String search;
    private ItemStatusEn status;
    private Double minPrice;
    private Double maxPrice;
}
