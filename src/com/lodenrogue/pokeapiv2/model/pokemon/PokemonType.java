package com.lodenrogue.pokeapiv2.model.pokemon;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class PokemonType {

  private int slot;

  private NamedAPIResource type;


  public int getSlot() {
    return this.slot;
  }

  public void setSlot(final int slot) {
    this.slot = slot;
  }

  public NamedAPIResource getType() {
    return this.type;
  }

  public void setType(final NamedAPIResource type) {
    this.type = type;
  }

}
