package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Input;

import java.math.BigDecimal;
import java.util.UUID;

@Input
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateInvoiceItemRequest {
    private UUID nurseryItemId;
    private Integer quantity;
    private BigDecimal unitPrice;
}
