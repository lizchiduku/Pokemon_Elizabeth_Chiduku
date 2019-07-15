public interface PokemonInterface {
    // your code here
	Pokemon createPokemon(String name, String type, int health);

	void attackPokemon(Pokemon pokemon);

	void pokemonInfo(Pokemon pokemon);
}
