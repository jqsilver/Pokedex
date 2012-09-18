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
