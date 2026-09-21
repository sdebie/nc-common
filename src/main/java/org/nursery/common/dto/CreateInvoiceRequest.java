package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Input;

import java.util.List;

@Input
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateInvoiceRequest {
    private String notes;
    private List<CreateInvoiceItemRequest> items;
}
