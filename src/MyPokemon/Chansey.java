package MyPokemon;

import moves.Chansey.Psychic;
import moves.Chansey.SeismicToss;
import moves.Chansey.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.Chansey.SeismicToss;

public class Chansey extends Happiny {
    public Chansey(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(250, 5, 5, 35, 105, 50);
        super.setMove(new SeismicToss());
    }
}
