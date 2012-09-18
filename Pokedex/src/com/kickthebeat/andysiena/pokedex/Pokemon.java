package com.kickthebeat.andysiena.pokedex;

import java.util.ArrayList;

public class Pokemon {
	int number; // universal pokedex number
	String name;
	String[] types; // make this an enum later I guess
	String image_path;
	
	ArrayList<String> moves; // make a Move class/struct for levels and types

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public ArrayList<String> getMoves() {
		return moves;
	}

	public void setMoves(ArrayList<String> moves) {
		this.moves = moves;
	}
	
	
}
