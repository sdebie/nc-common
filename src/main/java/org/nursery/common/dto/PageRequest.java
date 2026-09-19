package org.nursery.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Input;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Input
public class PageRequest {
    @Builder.Default
    private int page = 0;

    @Builder.Default
    private int size = 20;
}
