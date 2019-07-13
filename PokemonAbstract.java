import java.util.*;

public abstract class PokemonAbstract implements PokemonInterface {
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}

	public void attackPokemon(Pokemon pokemon) {
		pokemon.Health -=10;
		System.out.println("You were attacked and your health is now " + pokemon.health);
	}
}