package com.nanocat.inucute.pet;

public class PetType {
  private final String name;

  public PetType(String name) {
    this.name = name;
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
