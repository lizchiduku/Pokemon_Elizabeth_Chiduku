public class PokemonTest extends Pokemon{

	public static void main(String[] args) {
        Pokedex pd = new Pokedex();
        Pokemon squirtle = pd.createPokemon("squirtle", "water", 65);
        Pokemon balbasuar = pd.createPokemon("balbasaur", "fire", 70);
        pd.attackPokemon(balbasuar);
        pd.pokemonInfo(balbasuar);
        pd.attackPokemon(squirtle);
        pd.pokemonInfo(squirtle);
        System.out.println("\nNumber of Pokemon created so far: "+Pokemon.getCount()); 
	}

}
