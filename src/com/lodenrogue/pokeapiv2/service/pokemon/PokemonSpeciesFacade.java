
package com.lodenrogue.pokeapiv2.service.pokemon;

import com.lodenrogue.pokeapiv2.model.pokemon.PokemonSpecies;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;


/**
 * Create instances of {@link PokemonSpecies} with this facade.
 *
 * @author Adrian
 */
public class PokemonSpeciesFacade extends AbstractFacade<PokemonSpecies> {

  public PokemonSpeciesFacade() {
    super(PokemonSpecies.class);
  }

  @Override
  protected String getAddress() {
    return ResourceAddress.POKEMON_SPECIES_URL;
  }

}
