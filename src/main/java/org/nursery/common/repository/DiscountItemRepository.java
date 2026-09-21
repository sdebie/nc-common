package org.nursery.common.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.nursery.common.entity.DiscountItemEntity;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class DiscountItemRepository implements PanacheRepository<DiscountItemEntity> {
    public List<DiscountItemEntity> findByNurseryItemId(UUID nurseryItemId) {
        return find("nurseryItem.id = ?1", nurseryItemId).list();
    }

    public List<DiscountItemEntity> findByDiscountId(UUID discountId) {
        return find("discount.id = ?1", discountId).list();
    }
}
