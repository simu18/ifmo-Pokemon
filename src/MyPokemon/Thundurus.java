package MyPokemon;

import moves.Thundurus.Crunch;
import moves.Thundurus.FlashCannon;
import moves.Thundurus.SludgeWave;
import moves.Thundurus.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Thundurus  extends Pokemon {

    public Thundurus(String name, int level) {
        super(name, level);
        super.setType(Type.ELECTRIC, Type.FLYING);
        super.setStats(79,115,70,125,80,111);
        super.setMove(new Crunch(), new SludgeWave(), new FlashCannon(), new ThunderWave());
    }
}
