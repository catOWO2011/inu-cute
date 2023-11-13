package com.nanocat.inucute.pet;

import java.time.LocalDate;
import java.util.UUID;

public class Pet {
  private final UUID petId;
  private final String name;
  private final LocalDate birthDate;
  private final UUID typeId;

  public Pet(UUID petId, String name, LocalDate birthDate, UUID typeId) {
    this.petId = petId;
    this.name = name;
    this.birthDate = birthDate;
    this.typeId = typeId;
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

  public UUID getTypeId() {
    return typeId;
  }

  @Override
  public String toString() {
    return "Pet{" +
            "petId=" + petId +
            ", name='" + name + '\'' +
            ", birthDate=" + birthDate +
            ", typeId=" + typeId +
            '}';
  }
}
