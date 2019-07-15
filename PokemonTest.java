public class PokemonTest extends Pokedex {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon eerie = pokedex.createPokemon("Eerie", "electric", 120);
		Pokemon pikachu = pokedex.createPokemon("Pikachu", "fire", 50);

		pokedex.attackPokemon(eerie);
		pokedex.pokemonInfo(eerie);
		pokedex.pokemonInfo(pikachu);
	}

}