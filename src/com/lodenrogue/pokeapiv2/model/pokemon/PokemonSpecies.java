package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Description;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * A Pokemon Species forms the basis for at least one pokemon. Attributes of a Pokemon species are shared across all
 * varieties of pokemon within the species. A good example is Wormadam; Wormadam is the species which can be found in
 * three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
 *
 * @author Miguel Hernandez
 */
public class PokemonSpecies {

  @JsonProperty("base_happiness")
  private int baseHappiness;

  @JsonProperty("capture_rate")
  private int captureRate;

  private PokemonColor color;

  @JsonProperty("egg_groups")
  private List<NamedAPIResource> eggGroups;

  @JsonProperty("evolution_chain")
  private NamedAPIResource evolutionChain;

  @JsonProperty("evolves_from_species")
  private NamedAPIResource evolvesFromSpecies;

  @JsonProperty("form_descriptions")
  private List<Description> formDescriptions;

  @JsonProperty("forms_switchable")
  private boolean formsSwitchable;

  @JsonProperty("gender_rate")
  private int genderRate;

  private List<Genus> genera;

  private NamedAPIResource generation;

  @JsonProperty("growth_rate")
  private NamedAPIResource growthRate;

  private NamedAPIResource habitat;

  @JsonProperty("has_gender_differences")
  private boolean hasGenderDifferences;

  @JsonProperty("hatch_counter")
  private int hatchCounter;

  private int id;

  @JsonProperty("is_baby")
  private boolean isBaby;

  private String name;

  private List<Name> names;

  private int order;

  @JsonProperty("pal_park_encounters")
  private List<PalParkEncounterArea> palParkEncounters;

  @JsonProperty("pokedex_numbers")
  private List<PokemonSpeciesDexEntry> pokedexNumbers;

  private PokemonShape shape;

  private List<NamedAPIResource> varieties;

  /**********************************************************/
  /************************ Getter **************************/
  /**********************************************************/

  public int getBaseHappiness() {
    return this.baseHappiness;
  }

  public int getCaptureRate() {
    return this.captureRate;
  }

  public PokemonColor getColor() {
    return this.color;
  }

  public List<NamedAPIResource> getEggGroups() {
    return this.eggGroups;
  }

  public NamedAPIResource getEvolutionChain() {
    return this.evolutionChain;
  }

  public NamedAPIResource getEvolvesFromSpecies() {
    return this.evolvesFromSpecies;
  }

  public List<Description> getFormDescriptions() {
    return this.formDescriptions;
  }

  public int getGenderRate() {
    return this.genderRate;
  }

  public List<Genus> getGenera() {
    return this.genera;
  }

  public NamedAPIResource getGeneration() {
    return this.generation;
  }

  public NamedAPIResource getGrowthRate() {
    return this.growthRate;
  }

  public NamedAPIResource getHabitat() {
    return this.habitat;
  }

  public int getHatchCounter() {
    return this.hatchCounter;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public List<Name> getNames() {
    return this.names;
  }

  public int getOrder() {
    return this.order;
  }

  public List<PalParkEncounterArea> getPalParkEncounters() {
    return this.palParkEncounters;
  }

  public List<PokemonSpeciesDexEntry> getPokedexNumbers() {
    return this.pokedexNumbers;
  }

  public PokemonShape getShape() {
    return this.shape;
  }

  public List<NamedAPIResource> getVarieties() {
    return this.varieties;
  }

  public boolean isBaby() {
    return this.isBaby;
  }

  public boolean isFormsSwitchable() {
    return this.formsSwitchable;
  }

  public boolean isHasGenderDifferences() {
    return this.hasGenderDifferences;
  }

  /**********************************************************/
  /************************ Setter **************************/
  /**********************************************************/

  public void setBaby(final boolean isBaby) {
    this.isBaby = isBaby;
  }

  public void setBaseHappiness(final int baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

  public void setCaptureRate(final int captureRate) {
    this.captureRate = captureRate;
  }

  public void setColor(final PokemonColor color) {
    this.color = color;
  }

  public void setEggGroups(final List<NamedAPIResource> eggGroups) {
    this.eggGroups = eggGroups;
  }

  public void setEvolutionChain(final NamedAPIResource evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

  public void setEvolvesFromSpecies(final NamedAPIResource evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

  public void setFormDescriptions(final List<Description> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

  public void setFormsSwitchable(final boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

  public void setGenderRate(final int genderRate) {
    this.genderRate = genderRate;
  }

  public void setGenera(final List<Genus> genera) {
    this.genera = genera;
  }

  public void setGeneration(final NamedAPIResource generation) {
    this.generation = generation;
  }

  public void setGrowthRate(final NamedAPIResource growthRate) {
    this.growthRate = growthRate;
  }

  public void setHabitat(final NamedAPIResource habitat) {
    this.habitat = habitat;
  }

  public void setHasGenderDifferences(final boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

  public void setHatchCounter(final int hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setNames(final List<Name> names) {
    this.names = names;
  }

  public void setOrder(final int order) {
    this.order = order;
  }

  public void setPalParkEncounters(final List<PalParkEncounterArea> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

  public void setPokedexNumbers(final List<PokemonSpeciesDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  public void setShape(final PokemonShape shape) {
    this.shape = shape;
  }

  public void setVarieties(final List<NamedAPIResource> varieties) {
    this.varieties = varieties;
  }

}
