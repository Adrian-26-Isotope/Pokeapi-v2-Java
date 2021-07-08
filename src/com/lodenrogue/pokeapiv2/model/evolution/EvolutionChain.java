package com.lodenrogue.pokeapiv2.model.evolution;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution
 * conditions for each as well as pokemon they can evolve into up through the hierarchy.
 *
 * @author Miguel Hernandez
 */
public class EvolutionChain {

  private int id;

  @JsonProperty("baby_trigger_item")
  private NamedAPIResource babyTriggerItem;

  private ChainLink chain;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public NamedAPIResource getBabyTriggerItem() {
    return this.babyTriggerItem;
  }

  public void setBabyTriggerItem(final NamedAPIResource babyTriggerItem) {
    this.babyTriggerItem = babyTriggerItem;
  }

  public ChainLink getChain() {
    return this.chain;
  }

  public void setChain(final ChainLink chain) {
    this.chain = chain;
  }

}
