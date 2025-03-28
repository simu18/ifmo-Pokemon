package MyPokemon;
import moves.Happiny.Psychic;
import moves.Happiny.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(100,5,5,15,65,30);
        super.setMove(new Psychic(), new ThunderWave());

    }

}
