package MyPokemon;

import moves.Patrat.DoubleTeam;
import moves.Patrat.Swagger;
import moves.Patrat.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Patrat extends Pokemon {
    public Patrat(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(45,55,39,35,39,42);
        super.setMove(new WorkUp(), new DoubleTeam(), new Swagger());
    }
}
