package com.kickthebeat.andysiena.pokedex;

import java.util.ArrayList;

import android.app.Application;

public class PokemonApplication extends Application {

		private ArrayList<Pokemon> entries;
		
		public void onCreate() {
			super.onCreate();
			
			entries = loadPokemon();
			// later on we'll do db initialization here instead
		}

		private ArrayList<Pokemon> loadPokemon() {
			ArrayList<Pokemon> stubs = new ArrayList<Pokemon>();
			return stubs;
		}
		
		public Pokemon getDefaultTestPokemon() {
			Pokemon bulbasaur = new Pokemon();
			bulbasaur.setNumber(1);
			bulbasaur.setName("Bulbasaur");
			String[] types = {"grass", "poison"};
			bulbasaur.setTypes(types);
			bulbasaur.setInfo("A strange seed was planted on its back at birth. The plant sprouts and grows with this Pok�mon.");
			bulbasaur.setEvoData("It evolves into Ivysaur starting at level 16, which evolves into Venusaur starting at level 32.");
			return bulbasaur;
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
