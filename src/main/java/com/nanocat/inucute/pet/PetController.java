package com.nanocat.inucute.pet;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pets")
public class PetController {
  private final PetService petService;

  public PetController(PetService petService) {
    this.petService = petService;
  }

  @GetMapping()
  public List<Pet> getAllPets() {
    return List.of();
  }

  @PostMapping("/new")
  public void addNewPet(@RequestBody Pet pet) {
    petService.addNewPet(pet);
  }
}
