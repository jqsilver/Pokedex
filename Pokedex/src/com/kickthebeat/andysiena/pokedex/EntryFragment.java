package com.kickthebeat.andysiena.pokedex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class EntryFragment extends Fragment {

	Pokemon pokemon;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		
		// later we'll grab the id of the pokemon we want 
		// from the intent that called us or whatever
		pokemon = ((PokemonApplication) getActivity().getApplication())
				.getDefaultTestPokemon();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_entry, container, false);
		// set the view crap from the Pokemon instance
		TextView name = (TextView) v.findViewById(R.id.pokeName);
		name.setText(pokemon.getName());
		
		ImageView image = (ImageView) v.findViewById(R.id.pokeImg);
		image.setImageURI(pokemon.getImageUri());
		return v;
	}

	
	
}
