
package com.lodenrogue.pokeapiv2.service.pokemon;

import com.lodenrogue.pokeapiv2.model.pokemon.Pokemon;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;


/**
 * @author Adrian
 */
public class PokemonFacade extends AbstractFacade<Pokemon> {

  public PokemonFacade() {
    super(Pokemon.class);
  }


  @Override
  protected String getAddress() {
    return ResourceAddress.POKEMON_URL;
  }

}
