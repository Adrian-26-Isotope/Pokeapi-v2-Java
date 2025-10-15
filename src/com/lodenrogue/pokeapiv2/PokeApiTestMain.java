package com.lodenrogue.pokeapiv2;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lodenrogue.pokeapiv2.model.APIResource;
import com.lodenrogue.pokeapiv2.model.berries.Berry;
import com.lodenrogue.pokeapiv2.model.berries.BerryFirmness;
import com.lodenrogue.pokeapiv2.model.berries.BerryFlavor;
import com.lodenrogue.pokeapiv2.model.contests.ContestEffect;
import com.lodenrogue.pokeapiv2.model.contests.ContestType;
import com.lodenrogue.pokeapiv2.model.contests.SuperContestEffect;
import com.lodenrogue.pokeapiv2.model.encounters.EncounterMethod;
import com.lodenrogue.pokeapiv2.model.evolution.EvolutionChain;
import com.lodenrogue.pokeapiv2.model.pokemon.Pokemon;
import com.lodenrogue.pokeapiv2.model.pokemon.PokemonSpecies;
import com.lodenrogue.pokeapiv2.model.utility.Language;
import com.lodenrogue.pokeapiv2.service.berries.BerryFacade;
import com.lodenrogue.pokeapiv2.service.berries.BerryFirmnessFacade;
import com.lodenrogue.pokeapiv2.service.berries.BerryFlavorFacade;
import com.lodenrogue.pokeapiv2.service.contests.ContestEffectFacade;
import com.lodenrogue.pokeapiv2.service.contests.ContestTypeFacade;
import com.lodenrogue.pokeapiv2.service.contests.SuperContestEffectFacade;
import com.lodenrogue.pokeapiv2.service.encounter.EncounterMethodFacade;
import com.lodenrogue.pokeapiv2.service.evolution.EvolutionChainFacade;
import com.lodenrogue.pokeapiv2.service.pokemon.PokemonFacade;
import com.lodenrogue.pokeapiv2.service.pokemon.PokemonSpeciesFacade;
import com.lodenrogue.pokeapiv2.service.utility.LanguageFacade;

/**
 * Enable assertions (-ea) for a correct result.
 */
public class PokeApiTestMain {

  public static void main(final String[] args) {
    testEvolutionChain();
    testPokemon();
    testPokemonSpecies();
    testBerry();
    testBerryFirmness();
    testBerryFlavor();
    testContestEffect();
    testContestType();
    testEncounterMethod();
    testLanguage();
    testPrimitiveArray();
    testSuperContestEffect();
  }

  private static void testEvolutionChain() {
    EvolutionChain evoChain = new EvolutionChainFacade().find(8);
    assert evoChain.getChain() != null;
    assert evoChain.getChain().getEvolvesTo().get(0) != null;
    assert evoChain.getChain().getEvolutionDetails().isEmpty();
    System.out.println("evolution chain test passed");
  }

  private static void testPokemon() {
    Pokemon poke = new PokemonFacade().find(120);
    assert poke.getName().equals("staryu");
    assert poke.getAbilities().size() == 3;
    assert poke.getHeight() == 8;
    System.out.println("pokemon test passed");
  }

  private static void testPokemonSpecies() {
    PokemonSpecies pokemonSpecies = new PokemonSpeciesFacade().find("ivysaur");
    assert pokemonSpecies.getId() == 2;
    assert pokemonSpecies.getName().equals("ivysaur");
    assert pokemonSpecies.getCaptureRate() == 45;
    APIResource evolutionChain = pokemonSpecies.getEvolutionChain();
    EvolutionChain evoChain = new EvolutionChainFacade().find(evolutionChain);
    assert evoChain != null;
    System.out.println("pokemon species test passed");
  }

  private static void testEncounterMethod() {
    EncounterMethod method = new EncounterMethodFacade().find("old-rod");
    System.out.println(method.getNames().get(1).getName());
  }

  private static void testSuperContestEffect() {
    SuperContestEffect effect = new SuperContestEffectFacade().find(4);
    System.out.println(effect.getFlavorTextEntries().get(0).getFlavorText());
  }

  private static void testContestEffect() {
    ContestEffect effect = new ContestEffectFacade().find(4);
    System.out.println(effect.getEffectEntries().get(0).getEffect());
  }

  private static void testContestType() {
    ContestType type = new ContestTypeFacade().find("tough");
    System.out.println(type.getNames().get(0).getName());
  }

  private static void testBerryFlavor() {
    BerryFlavor flavor = new BerryFlavorFacade().find(4);
    System.out.println(flavor.getBerries().get(0).getPotency());
  }

  private static void testBerryFirmness() {
    BerryFirmness firmness = new BerryFirmnessFacade().find("very-soft");
    System.out.println(firmness.getBerries().get(0).getName());

  }

  private static void testBerry() {
    Berry berry = new BerryFacade().find(2);
    System.out.println(berry.getSmoothness() == 25);
    System.out.println(berry.getName());
    System.out.println(berry.getFlavors().get(0).getFlavor().getName());
  }

  /**
   *
   */
  private static void testPrimitiveArray() {
    String json = "{\"possible_values\": [0, 5, 10, 15, 20, 25, 30]}";

    ObjectMapper mapper = new ObjectMapper();
    try {
      TestClass test = mapper.readValue(json, TestClass.class);
      System.out.println(Arrays.toString(test.getPossibleValues()));
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   *
   */
  private static void testLanguage() {
    Language language = new LanguageFacade().find(9);

    System.out.print(language.getId() + " " + language.getName() + " ");
    language.getNames().forEach(n -> {
      System.out.print(n.getName() + " ");
    });
  }

}
