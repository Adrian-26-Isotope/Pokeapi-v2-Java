package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.APIResource;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class Stat {

  private int id;
  private String name;

  @JsonProperty("game_index")
  private int gameIndex;

  @JsonProperty("is_battle_only")
  private boolean isBattleOnly;

  @JsonProperty("affecting_moves")
  private MoveStatAffectSets affectingMoves;

  @JsonProperty("affecting_natures")
  private NatureStatAffectSets affectingNatures;

  private List<APIResource> characteristics;

  @JsonProperty("move_damage_class")
  private NamedAPIResource moveDamageClass;

  private List<Name> names;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getGameIndex() {
    return this.gameIndex;
  }

  public void setGameIndex(final int gameIndex) {
    this.gameIndex = gameIndex;
  }

  public boolean isBattleOnly() {
    return this.isBattleOnly;
  }

  public void setBattleOnly(final boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  public MoveStatAffectSets getAffectingMoves() {
    return this.affectingMoves;
  }

  public void setAffectingMoves(final MoveStatAffectSets affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  public NatureStatAffectSets getAffectingNatures() {
    return this.affectingNatures;
  }

  public void setAffectingNatures(final NatureStatAffectSets affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  public List<APIResource> getCharacteristics() {
    return this.characteristics;
  }

  public void setCharacteristics(final List<APIResource> characteristics) {
    this.characteristics = characteristics;
  }

  public NamedAPIResource getMoveDamageClass() {
    return this.moveDamageClass;
  }

  public void setMoveDamageClass(final NamedAPIResource moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  public List<Name> getNames() {
    return this.names;
  }

  public void setNames(final List<Name> names) {
    this.names = names;
  }

}
