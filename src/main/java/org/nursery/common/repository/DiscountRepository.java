package org.nursery.common.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.nursery.common.entity.DiscountEntity;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class DiscountRepository implements PanacheRepository<DiscountEntity> {
    public List<DiscountEntity> findActiveDiscounts(Instant now) {
        return find("isActive = true AND startDate <= ?1 AND endDate >= ?1 ORDER BY startDate DESC", now).list();
    }
}
