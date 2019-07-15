public abstract class PokemonAbstract implements PokemonInterface {
	// your code here
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}

	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(-10);
	}
}