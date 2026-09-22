package org.nursery.common.dto;

import lombok.Data;
import org.eclipse.microprofile.graphql.Input;
import org.eclipse.microprofile.graphql.Name;

import java.time.Instant;
import java.util.List;

@Input
@Data
public class CreateAuctionRequest {
    @Name("auctionName")
    private String auctionName;

    @Name("description")
    private String description;

    @Name("auctionDate")
    private Instant auctionDate;

    @Name("items")
    private List<AuctionItemRequest> items;

    @Input
    @Data
    public static class AuctionItemRequest {
        @Name("nurseryItemId")
        private String nurseryItemId;

        @Name("startingPrice")
        private Double startingPrice;

        @Name("estimatedPrice")
        private Double estimatedPrice;

        @Name("reservePrice")
        private Double reservePrice;
    }
}
