package org.nursery.common.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.nursery.common.entity.AuctionEntity;

import java.util.UUID;

@ApplicationScoped
public class AuctionRepository implements PanacheRepository<AuctionEntity> {
}
