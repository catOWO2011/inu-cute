package com.nanocat.inucute.pet;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/petypes")
public class PetTypeController {
  private final PetTypeService petTypeService;

  public PetTypeController(PetTypeService petTypeService) {
    this.petTypeService = petTypeService;
  }

  @RequestMapping("/new")
  @PostMapping
  public void addPetType(@RequestBody PetType petType){
    petTypeService.addPetType(petType);
  }
}
