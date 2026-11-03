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
@Table(name = "credit_note")
public class CreditNoteEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "credit_note_no", nullable = false, unique = true, length = 50)
    private String creditNoteNo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "return_request_id", nullable = false)
    private ReturnRequestEntity returnRequest;

    @Column(name = "credit_amount", nullable = false)
    private BigDecimal creditAmount;

    @Column(name = "issue_date", nullable = false)
    private Instant issueDate;

    @Column(name = "reason", columnDefinition = "TEXT")
    private String reason;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
