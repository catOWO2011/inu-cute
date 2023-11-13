package com.nanocat.inucute.pet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class PetTypeDataAccessService {
  private static final String  INSERT_PETTYPE = "INSERT INTO types(id, name) VALUES(?, ?)";
  private final JdbcTemplate jdbcTemplate;

  public PetTypeDataAccessService(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public int insertPetType(UUID petTypeId, PetType newPetType) {
    return jdbcTemplate.update(INSERT_PETTYPE,
            petTypeId,
            newPetType.getName());
  }
}
