package com.lodenrogue.pokeapiv2.model.evolution;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * @author Miguel Hernandez
 */
public class ChainLink {

  @JsonProperty("evolution_details")
  private List<EvolutionDetail> evolutionDetails;

  @JsonProperty("evolves_to")
  private List<ChainLink> evolvesTo;

  private boolean isBaby;

  private NamedAPIResource species;


  public List<EvolutionDetail> getEvolutionDetails() {
    return this.evolutionDetails;
  }

  public List<ChainLink> getEvolvesTo() {
    return this.evolvesTo;
  }

  public NamedAPIResource getSpecies() {
    return this.species;
  }

  public boolean isBaby() {
    return this.isBaby;
  }

  public void setBaby(final boolean isBaby) {
    this.isBaby = isBaby;
  }

  public void setEvolutionDetails(final List<EvolutionDetail> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public void setEvolvesTo(final List<ChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  public void setSpecies(final NamedAPIResource species) {
    this.species = species;
  }

}
