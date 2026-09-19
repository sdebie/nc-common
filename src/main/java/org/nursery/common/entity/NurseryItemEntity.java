package org.nursery.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.nursery.common.enums.ItemStatusEn;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "nursery_items")
public class NurseryItemEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "item_no", nullable = false, unique = true, length = 50)
    private String itemNo;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(name = "original_price", nullable = false)
    private BigDecimal originalPrice;

    @Column(name = "sale_price", nullable = false)
    private BigDecimal salePrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ItemStatusEn status;

    @Column(nullable = false)
    private Integer diameter;

    @Column(name = "available_sequence")
    private Integer availableSequence;

    @Column(length = 255)
    private String source;

    @Column(name = "source_row")
    private Integer sourceRow;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
