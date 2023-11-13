package com.nanocat.inucute.pet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class PetDataAccessService {
  private static final String INSERT_PET = "INSERT INTO pets (id, type_id, name, birth_date) VALUES (?, ?, ?, ?)";
  private final JdbcTemplate jdbcTemplate;

  public PetDataAccessService(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public int insertPet(UUID petId, Pet newPet) {
    return jdbcTemplate.update(INSERT_PET,
            petId,
            newPet.getTypeId(),
            newPet.getName(),
            newPet.getBirthDate()
    );
  }
}
