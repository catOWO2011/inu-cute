package com.nanocat.inucute.pet;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PetService {
  private final PetDataAccessService petDataAccessService;

  public PetService(PetDataAccessService petDataAccessService) {
    this.petDataAccessService = petDataAccessService;
  }

  public void addNewPet(Pet newPet) {
    addNewPet(null, newPet);
  }

  public void addNewPet(UUID petId, Pet newPet) {
    UUID newPetId = Optional.ofNullable(petId).orElse(UUID.randomUUID());
    petDataAccessService.insertPet(newPetId, newPet);
  }
}
