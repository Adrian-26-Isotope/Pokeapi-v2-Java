package com.lodenrogue.pokeapiv2.model.evolution;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * @author Miguel Hernandez
 */
public class EvolutionDetail {

  private NamedAPIResource gender;

  @JsonProperty("held_item")
  private NamedAPIResource heldItem;

  private NamedAPIResource item;

  @JsonProperty("known_move")
  private NamedAPIResource knownMove;

  @JsonProperty("known_move_type")
  private NamedAPIResource knownMoveType;

  private NamedAPIResource location;
  @JsonProperty("min_affection")
  private int minAffection;

  @JsonProperty("min_beauty")
  private int minBeauty;

  @JsonProperty("min_happiness")
  private int minHappiness;

  @JsonProperty("min_level")
  private int minLevel;

  @JsonProperty("needs_overworld_rain")
  private boolean needsOverworldRain;

  @JsonProperty("party_species")
  private NamedAPIResource partySpecies;

  @JsonProperty("party_type")
  private NamedAPIResource partyType;

  @JsonProperty("relative_physical_stats")
  private NamedAPIResource relativePhysicalStats;

  @JsonProperty("time_of_day")
  private String timeOfDay;

  @JsonProperty("trade_species")
  private NamedAPIResource tradeSpecies;

  private NamedAPIResource trigger;

  @JsonProperty("turn_upside_down")
  private boolean turnUpsideDown;


  public NamedAPIResource getGender() {
    return this.gender;
  }

  public NamedAPIResource getHeldItem() {
    return this.heldItem;
  }

  public NamedAPIResource getItem() {
    return this.item;
  }

  public NamedAPIResource getKnownMove() {
    return this.knownMove;
  }

  public NamedAPIResource getKnownMoveType() {
    return this.knownMoveType;
  }

  public NamedAPIResource getLocation() {
    return this.location;
  }

  public int getMinAffection() {
    return this.minAffection;
  }

  public int getMinBeauty() {
    return this.minBeauty;
  }

  public int getMinHappiness() {
    return this.minHappiness;
  }

  public int getMinLevel() {
    return this.minLevel;
  }

  public NamedAPIResource getPartySpecies() {
    return this.partySpecies;
  }

  public NamedAPIResource getPartyType() {
    return this.partyType;
  }

  public NamedAPIResource getRelativePhysicalStats() {
    return this.relativePhysicalStats;
  }

  public String getTimeOfDay() {
    return this.timeOfDay;
  }

  public NamedAPIResource getTradeSpecies() {
    return this.tradeSpecies;
  }

  public NamedAPIResource getTrigger() {
    return this.trigger;
  }

  public boolean isNeedsOverworldRain() {
    return this.needsOverworldRain;
  }

  public boolean isTurnUpsideDown() {
    return this.turnUpsideDown;
  }

  public void setGender(final NamedAPIResource gender) {
    this.gender = gender;
  }

  public void setHeldItem(final NamedAPIResource heldItem) {
    this.heldItem = heldItem;
  }

  public void setItem(final NamedAPIResource item) {
    this.item = item;
  }

  public void setKnownMove(final NamedAPIResource knownMove) {
    this.knownMove = knownMove;
  }

  public void setKnownMoveType(final NamedAPIResource knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  public void setLocation(final NamedAPIResource location) {
    this.location = location;
  }

  public void setMinAffection(final int minAffection) {
    this.minAffection = minAffection;
  }

  public void setMinBeauty(final int minBeauty) {
    this.minBeauty = minBeauty;
  }

  public void setMinHappiness(final int minHappiness) {
    this.minHappiness = minHappiness;
  }

  public void setMinLevel(final int minLevel) {
    this.minLevel = minLevel;
  }

  public void setNeedsOverworldRain(final boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  public void setPartySpecies(final NamedAPIResource partySpecies) {
    this.partySpecies = partySpecies;
  }

  public void setPartyType(final NamedAPIResource partyType) {
    this.partyType = partyType;
  }

  public void setRelativePhysicalStats(final NamedAPIResource relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  public void setTimeOfDay(final String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public void setTradeSpecies(final NamedAPIResource tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  public void setTrigger(final NamedAPIResource trigger) {
    this.trigger = trigger;
  }

  public void setTurnUpsideDown(final boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
  }

}
