package com.nanocat.inucute.pet;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PetTypeService {
  private final PetTypeDataAccessService petTypeDataAccessService;

  public PetTypeService(PetTypeDataAccessService petTypeDataAccessService) {
    this.petTypeDataAccessService = petTypeDataAccessService;
  }

  public void addPetType(PetType petType) {
    addNewPetType(null, petType);
  }

  public void addNewPetType(UUID petTypeId, PetType newPetType) {
    UUID newPetTypeId = Optional.ofNullable(petTypeId).orElse(UUID.randomUUID());
    petTypeDataAccessService.insertPetType(newPetTypeId, newPetType);
  }
}
