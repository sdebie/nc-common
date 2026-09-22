package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuctionDto {
    private UUID id;
    private String auctionName;
    private String description;
    private Instant auctionDate;
    private String status;
    private List<AuctionItemDto> items;
    private Instant createdAt;
    private Instant updatedAt;
}
