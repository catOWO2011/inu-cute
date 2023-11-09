package com.nanocat.inucute.pet;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pets")
public class PetController {
  @GetMapping()
  public List<Pet> getAllPets() {
    return List.of(new Pet(
       UUID.randomUUID(),
       "tobi",
            LocalDate.now(),
            new PetType("Cat")
    ));
  }

  @PostMapping("/new")
  public void addNewPet(@RequestBody Pet pet) {

  }
}
