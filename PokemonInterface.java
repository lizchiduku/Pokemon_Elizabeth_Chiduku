import java.util.*;

public interface PokemonInterface {
    Pokemon createPokemon(String name, int health, String type);
    void attackPokemon(Pokemon pokemon);
    void PokemonInfo(Pokemon pokemon);
}
