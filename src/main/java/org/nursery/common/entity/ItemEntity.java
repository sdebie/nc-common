package org.nursery.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.nursery.common.enums.ItemStatusEn;
import org.nursery.common.enums.ItemTypeEn;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "item")
public class ItemEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "item_no", nullable = false, unique = true, length = 50)
    private String itemNo;

    @Column(name = "family_id")
    private UUID familyId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "family_id", insertable = false, updatable = false)
    private ItemFamilyEntity family;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(name = "original_price", nullable = false)
    private BigDecimal originalPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "item_type", nullable = false)
    private ItemTypeEn itemType;

    @Enumerated(EnumType.STRING)
    @Column(name = "item_status", nullable = false)
    private ItemStatusEn itemStatus;

    @Column(nullable = false)
    private Integer diameter;

    @Column(name = "available_sequence")
    private Integer availableSequence;

    @Column(length = 255)
    private String source;

    @Column(name = "source_row")
    private Integer sourceRow;

    @Column(name = "quantity_in_stock", nullable = false)
    private Integer quantityInStock;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
