package org.nursery.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;
import org.nursery.common.enums.AuctionStatusEn;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "auction")
public class AuctionEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "auction_name", nullable = false, length = 255)
    private String auctionName;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "auction_date", nullable = false)
    private Instant auctionDate;

    @OneToMany(mappedBy = "auction", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<AuctionItemEntity> items;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    public AuctionStatusEn getCalculatedStatus() {
        Instant now = Instant.now();
        if (auctionDate.isAfter(now)) {
            return AuctionStatusEn.SCHEDULED;
        } else if (auctionDate.plusSeconds(86400).isAfter(now)) {
            return AuctionStatusEn.ACTIVE;
        } else {
            return AuctionStatusEn.COMPLETED;
        }
    }
}
