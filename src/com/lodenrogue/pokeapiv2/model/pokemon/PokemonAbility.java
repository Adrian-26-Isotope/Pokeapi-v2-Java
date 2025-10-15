package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class PokemonAbility {

  private NamedAPIResource ability;

  @JsonProperty("is_hidden")
  private boolean isHidden;

  private int slot;


  public NamedAPIResource getAbility() {
    return this.ability;
  }

  public boolean getIsHidden() {
    return this.isHidden;
  }

  public int getSlot() {
    return this.slot;
  }

  public void setAbility(final NamedAPIResource ability) {
    this.ability = ability;
  }

  public void setIsHidden(final boolean isHidden) {
    this.isHidden = isHidden;
  }

  public void setSlot(final int slot) {
    this.slot = slot;
  }

}
