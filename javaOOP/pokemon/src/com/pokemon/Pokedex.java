package com.pokemon;

public class Pokedex extends AbstractPokemon{
		public void pokemonInfo(Pokemon pokemon) {
			System.out.print("Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType());
		}

		@Override
		public Pokemon createPokemon(String name, String type, int health) {
			// TODO Auto-generated method stub
			return null;
		}
}
