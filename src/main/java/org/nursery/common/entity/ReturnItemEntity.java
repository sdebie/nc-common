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
@Table(name = "return_item")
public class ReturnItemEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "return_request_id", nullable = false)
    private ReturnRequestEntity returnRequest;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "invoice_item_id", nullable = false)
    private InvoiceItemEntity invoiceItem;

    @Column(name = "quantity_returned", nullable = false)
    private Integer quantityReturned;

    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;

    @Column(name = "total_return_amount", nullable = false)
    private BigDecimal totalReturnAmount;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
