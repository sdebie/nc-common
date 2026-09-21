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
public class ItemFamilyDto {
    private UUID id;
    private String name;
    private String code;
    private Instant createdAt;
    private Instant updatedAt;
}
