package MyPokemon;

import moves.Watchog.DoubleTeam;
import moves.Watchog.Swagger;
import moves.Watchog.ThunderWave;
import moves.Watchog.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Watchog extends Patrat {
    public Watchog(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(60,85,69,60,69,77);
        super.setMove(new ThunderWave());

    }
}
