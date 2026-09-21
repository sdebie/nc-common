package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Input;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Input
public class SettingsDto {
    private UUID id;
    private String companyName;
    private String address;
    private String cellPhone;
    private String fax;
    private String email;
    private String website;
    private String tradingHours;
    private Instant createdAt;
    private Instant updatedAt;
}
