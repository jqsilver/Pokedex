package com.kickthebeat.andysiena.pokedex;

import java.util.ArrayList;

import android.app.Application;

public class PokemonApplication extends Application {

		private ArrayList<Pokemon> entries;
		
		public void onCreate() {
			super.onCreate();
			
			entries = getStubPokemon();
			// later on we'll do db initialization here instead
		}

		private ArrayList<Pokemon> getStubPokemon() {
			ArrayList<Pokemon> stubs = new ArrayList<Pokemon>();
			Pokemon bulbasaur = new Pokemon();
			bulbasaur.setNumber(1);
			bulbasaur.setName("Bulbasaur");
			String[] types = {"grass","poison"};
			bulbasaur.setTypes(types);
			bulbasaur.setInfo("A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon.");
			bulbasaur.setEvoData("It evolves into Ivysaur starting at level 16, which evolves into Venusaur starting at level 32.");
			bulbasaur.setImage_path("http://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/160px-001Bulbasaur.png");
			stubs.add(bulbasaur);
			return stubs;
		}
		
		public Pokemon getPokemon(int number) throws PokemonNotFoundException {
			// should probably use a Map but we'll do that later
			for (Pokemon p : entries) {
				if (p.getNumber() == number) {
					return p;
				}
			}
			throw new PokemonNotFoundException();
		}
	
}
