
package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * @author Adrian
 */
public class PokemonStat {

  @JsonProperty("base_stat")
  private int baseStat;

  private int effort;

  private NamedAPIResource stat;


  public int getBaseStat() {
    return this.baseStat;
  }

  public void setBaseStat(final int baseStat) {
    this.baseStat = baseStat;
  }

  public int getEffort() {
    return this.effort;
  }

  public void setEffort(final int effort) {
    this.effort = effort;
  }

  public NamedAPIResource getStat() {
    return this.stat;
  }

  public void setStat(final NamedAPIResource stat) {
    this.stat = stat;
  }

}
