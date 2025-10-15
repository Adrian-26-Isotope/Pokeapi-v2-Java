package com.lodenrogue.pokeapiv2.service.evolution;

import com.lodenrogue.pokeapiv2.model.evolution.EvolutionChain;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;


/**
 * @author Adrian
 */
public class EvolutionChainFacade extends AbstractFacade<EvolutionChain> {

  public EvolutionChainFacade() {
    super(EvolutionChain.class);
  }

  @Override
  protected String getAddress() {
    return ResourceAddress.EVOLUTION_CHAIN_URL;
  }

}
