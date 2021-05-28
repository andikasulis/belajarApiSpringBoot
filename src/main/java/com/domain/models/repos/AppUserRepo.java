package com.domain.models.repos;

import com.domain.models.entities.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface AppUserRepo extends PagingAndSortingRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);
}
