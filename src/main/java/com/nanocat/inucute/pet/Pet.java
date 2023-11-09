package com.nanocat.inucute.pet;

import java.time.LocalDate;
import java.util.UUID;

public class Pet {
  private final UUID petId;
  private final String name;
  private final LocalDate birthDate;
  private PetType petType;

  public Pet(UUID petId, String name, LocalDate birthDate, PetType petType) {
    this.petId = petId;
    this.name = name;
    this.birthDate = birthDate;
    this.petType = petType;
  }

  public UUID getPetId() {
    return petId;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public PetType getPetType() {
    return petType;
  }

  @Override
  public String toString() {
    return "Pet{" +
            "petId=" + petId +
            ", name='" + name + '\'' +
            ", birthDate=" + birthDate +
            ", petType=" + petType +
            '}';
  }
}
