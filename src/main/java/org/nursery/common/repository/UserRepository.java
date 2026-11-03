package org.nursery.common.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.nursery.common.entity.UserEntity;

import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class UserRepository implements PanacheRepository<UserEntity> {
    public Optional<UserEntity> findByEmail(String email) {
        return find("email", email).firstResultOptional();
    }
}
