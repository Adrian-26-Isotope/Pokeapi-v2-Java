package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VersionEncounterDetail;

public class LocationAreaEncounter {

  @JsonProperty("location_area")
  private NamedAPIResource locationArea;

  @JsonProperty("version_details")
  private List<VersionEncounterDetail> versionDetails;

  public NamedAPIResource getLocationArea() {
    return this.locationArea;
  }

  public void setLocationArea(final NamedAPIResource locationArea) {
    this.locationArea = locationArea;
  }

  public List<VersionEncounterDetail> getVersionDetails() {
    return this.versionDetails;
  }

  public void setVersionDetails(final List<VersionEncounterDetail> versionDetails) {
    this.versionDetails = versionDetails;
  }

}
