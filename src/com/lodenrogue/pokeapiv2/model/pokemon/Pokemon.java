package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VersionGameIndex;

/**
 * Pokemon are the creatures that inhabit the world of the pokemon games. They can be caught using pokeball's and
 * trained by battling with other pokemon.
 *
 * @author Miguel Hernandez
 */
public class Pokemon {

  private List<PokemonAbility> abilities;

  @JsonProperty("base_experience")
  private int baseExperience;

  private List<NamedAPIResource> forms;

  @JsonProperty("game_indices")
  private List<VersionGameIndex> gameIndices;

  private int height;

  @JsonProperty("held_items")
  private List<NamedAPIResource> heldItems;

  private int id;

  @JsonProperty("is_default")
  private boolean isDefault;

  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;

  private List<NamedAPIResource> moves;

  private String name;

  private int order;

  private NamedAPIResource species;

  private List<PokemonStat> stats;

  private List<PokemonType> types;

  private int weight;


  public List<PokemonAbility> getAbilities() {
    return this.abilities;
  }

  public int getBaseExperience() {
    return this.baseExperience;
  }

  public List<NamedAPIResource> getForms() {
    return this.forms;
  }

  public List<VersionGameIndex> getGameIndices() {
    return this.gameIndices;
  }

  public int getHeight() {
    return this.height;
  }

  public List<NamedAPIResource> getHeldItems() {
    return this.heldItems;
  }

  public int getId() {
    return this.id;
  }

  public String getLocationAreaEncounters() {
    return this.locationAreaEncounters;
  }

  public List<NamedAPIResource> getMoves() {
    return this.moves;
  }

  public String getName() {
    return this.name;
  }

  public int getOrder() {
    return this.order;
  }

  public NamedAPIResource getSpecies() {
    return this.species;
  }

  public List<PokemonStat> getStats() {
    return this.stats;
  }

  public List<PokemonType> getTypes() {
    return this.types;
  }

  public int getWeight() {
    return this.weight;
  }

  public boolean isDefault() {
    return this.isDefault;
  }

  public void setAbilities(final List<PokemonAbility> abilities) {
    this.abilities = abilities;
  }

  public void setBaseExperience(final int baseExperience) {
    this.baseExperience = baseExperience;
  }

  public void setDefault(final boolean isDefault) {
    this.isDefault = isDefault;
  }

  public void setForms(final List<NamedAPIResource> forms) {
    this.forms = forms;
  }

  public void setGameIndices(final List<VersionGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public void setHeight(final int height) {
    this.height = height;
  }

  public void setHeldItems(final List<NamedAPIResource> heldItems) {
    this.heldItems = heldItems;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public void setLocationAreaEncounters(final String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  public void setMoves(final List<NamedAPIResource> moves) {
    this.moves = moves;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setOrder(final int order) {
    this.order = order;
  }

  public void setSpecies(final NamedAPIResource species) {
    this.species = species;
  }

  public void setStats(final List<PokemonStat> stats) {
    this.stats = stats;
  }

  public void setTypes(final List<PokemonType> types) {
    this.types = types;
  }

  public void setWeight(final int weight) {
    this.weight = weight;
  }

}
