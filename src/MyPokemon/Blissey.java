package MyPokemon;

import moves.Blissey.CalmMind;
import moves.Blissey.Psychic;
import moves.Blissey.SeismicToss;
import moves.Blissey.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.Blissey.CalmMind;

public class Blissey extends Chansey {

    public Blissey(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(250, 10, 10, 75, 135, 55);
        super.setMove(new CalmMind());
    }

}
