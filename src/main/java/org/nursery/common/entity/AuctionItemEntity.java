package org.nursery.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "auction_item")
public class AuctionItemEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "auction_id", nullable = false)
    private AuctionEntity auction;

    // Item details stored directly (decoupled from item table)
    @Column(name = "item_no", length = 50)
    private String itemNo;

    @Column(name = "item_description", length = 1000)
    private String itemDescription;

    @Column(name = "item_diameter")
    private BigDecimal itemDiameter;

    @Column(name = "item_height")
    private BigDecimal itemHeight;

    @Column(name = "item_original_price")
    private BigDecimal itemOriginalPrice;

    // Auction-specific pricing
    @Column(name = "starting_price", nullable = false)
    private BigDecimal startingPrice;

    @Column(name = "sold_price")
    private BigDecimal soldPrice;

    @Column(name = "estimated_price")
    private BigDecimal estimatedPrice;

    @Column(name = "reserve_price")
    private BigDecimal reservePrice;

    @Column(columnDefinition = "TEXT")
    private String note;

    // Winning bidder - tracks who won/bought this lot
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "winning_bidder_id")
    private AuctionParticipantEntity winningBidder;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
