package moves.Watchog;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class WorkUp extends StatusMove {
    public WorkUp(){
        super(Type.NORMAL,0,0);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // Increases the user's Attack and Special Attack by one stage each
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "uses Work Up to boost its Attack and Special Attack";
    }
}

