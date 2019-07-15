public class Pokedex extends PokemonAbstract {
  // your code here
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println(
				"Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType());
	}
}