package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Type
public class ItemImageDto {
    private UUID id;
    private UUID itemId;
    private String imageUrl;
    private Integer sortOrder;
    private String altText;
    private Boolean mainImage;
    private Instant createdAt;
    private Instant updatedAt;
}
