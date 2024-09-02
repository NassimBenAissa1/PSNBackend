package com.example.PSNBackend.repositories;

import com.example.PSNBackend.models.ERole;
import com.example.PSNBackend.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
