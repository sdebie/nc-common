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
public class AuctionParticipantDto {
    private UUID id;
    private UUID auctionId;
    private UUID userId;
    private Integer participantNumber;
    private String userName;
    private String userEmail;
    private Instant joinedAt;
    private Instant createdAt;
    private Instant updatedAt;
}
