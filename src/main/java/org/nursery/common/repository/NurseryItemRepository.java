package org.nursery.common.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.nursery.common.entity.NurseryItemEntity;

import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class NurseryItemRepository implements PanacheRepository<NurseryItemEntity> {

    public Optional<NurseryItemEntity> findByItemNo(String itemNo) {
        return find("itemNo", itemNo).firstResultOptional();
    }

    public boolean existsByItemNo(String itemNo) {
        return count("itemNo", itemNo) > 0;
    }
}
