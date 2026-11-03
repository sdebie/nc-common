package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private UUID id;
    private String email;
    private String name;
    private String phone;
    private String status;
    private BigDecimal accountCreditBalance;
    private Instant createdAt;
    private Instant updatedAt;
}
