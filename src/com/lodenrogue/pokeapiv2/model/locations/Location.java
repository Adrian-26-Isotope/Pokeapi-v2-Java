package com.lodenrogue.pokeapiv2.model.locations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.GenerationGameIndex;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
 *
 * @author Miguel Hernandez
 */
public class Location {

  private int id;

  private String name;

  private NamedAPIResource region;

  private List<Name> names;

  @JsonProperty("game_indices")
  private List<GenerationGameIndex> gameIndices;

  private List<NamedAPIResource> areas;

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

  public NamedAPIResource getRegion() {
    return this.region;
  }

  public void setRegion(final NamedAPIResource region) {
    this.region = region;
  }

  public List<Name> getNames() {
    return this.names;
  }

  public void setNames(final List<Name> names) {
    this.names = names;
  }

  public List<GenerationGameIndex> getGameIndices() {
    return this.gameIndices;
  }

  public void setGameIndices(final List<GenerationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public List<NamedAPIResource> getAreas() {
    return this.areas;
  }

  public void setAreas(final List<NamedAPIResource> areas) {
    this.areas = areas;
  }

}
