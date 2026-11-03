package org.nursery.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;
import org.nursery.common.enums.ReturnStatusEn;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "return_request")
public class ReturnRequestEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "return_no", nullable = false, unique = true, length = 50)
    private String returnNo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "invoice_id", nullable = false)
    private InvoiceEntity invoice;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private ReturnStatusEn status;

    @Column(name = "return_date", nullable = false)
    private Instant returnDate;

    @Column(name = "approval_date")
    private Instant approvalDate;

    @Column(name = "reason", columnDefinition = "TEXT")
    private String reason;

    @Column(name = "total_return_amount", nullable = false)
    private BigDecimal totalReturnAmount;

    @OneToMany(mappedBy = "returnRequest", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<ReturnItemEntity> items;

    @OneToOne(mappedBy = "returnRequest", fetch = FetchType.EAGER)
    private CreditNoteEntity creditNote;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
