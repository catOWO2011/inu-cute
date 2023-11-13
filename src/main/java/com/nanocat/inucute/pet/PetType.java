package com.nanocat.inucute.pet;

import java.util.UUID;

public class PetType {
  private final String name;
  private final UUID petTypeId;

  public PetType(String name, UUID petTypeId) {
    this.name = name;
    this.petTypeId = petTypeId;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "PetType{" +
            "name='" + name + '\'' +
            '}';
  }
}
