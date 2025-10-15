package com.lodenrogue.pokeapiv2.model.items;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.GenerationGameIndex;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VerboseEffect;
import com.lodenrogue.pokeapiv2.model.VersionGroupFlavorText;

/**
 * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have
 * various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
 *
 * @author Miguel Hernandez
 */
public class Item {

  private int id;
  private String name;
  private int cost;
  private int flingPower;
  private ItemFlingEffect flingEffect;
  private List<NamedAPIResource> attributes;
  private ItemCategory category;
  private List<VerboseEffect> effectEntries;
  private List<VersionGroupFlavorText> flavorTextEntries;
  private List<GenerationGameIndex> gameIndices;
  private List<Name> names;
  private List<NamedAPIResource> heldByPokemon;

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

  public int getCost() {
    return this.cost;
  }

  public void setCost(final int cost) {
    this.cost = cost;
  }

  public int getFlingPower() {
    return this.flingPower;
  }

  public void setFlingPower(final int flingPower) {
    this.flingPower = flingPower;
  }

  public ItemFlingEffect getFlingEffect() {
    return this.flingEffect;
  }

  public void setFlingEffect(final ItemFlingEffect flingEffect) {
    this.flingEffect = flingEffect;
  }

  public List<NamedAPIResource> getAttributes() {
    return this.attributes;
  }

  public void setAttributes(final List<NamedAPIResource> attributes) {
    this.attributes = attributes;
  }

  public ItemCategory getCategory() {
    return this.category;
  }

  public void setCategory(final ItemCategory category) {
    this.category = category;
  }

  public List<VerboseEffect> getEffectEntries() {
    return this.effectEntries;
  }

  public void setEffectEntries(final List<VerboseEffect> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public List<VersionGroupFlavorText> getFlavorTextEntries() {
    return this.flavorTextEntries;
  }

  public void setFlavorTextEntries(final List<VersionGroupFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public List<GenerationGameIndex> getGameIndices() {
    return this.gameIndices;
  }

  public void setGameIndices(final List<GenerationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public List<Name> getNames() {
    return this.names;
  }

  public void setNames(final List<Name> names) {
    this.names = names;
  }

  public List<NamedAPIResource> getHeldByPokemon() {
    return this.heldByPokemon;
  }

  public void setHeldByPokemon(final List<NamedAPIResource> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }
}