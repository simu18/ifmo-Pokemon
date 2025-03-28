package moves.Patrat;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL,0,0);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // Increases the user's Evasion stat by one stage
        p.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "uses Double Team to boost its Evasion";
    }
}
