package moves.Blissey;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SeismicToss extends PhysicalMove {
    public SeismicToss(){
        super(Type.FIGHTING,0,100);

    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        // Calculate damage based on the user's level
        int userLevel = def.getLevel();
        def.setMod(Stat.HP, userLevel);
    }

    @Override
    protected String describe() {
        return "uses Seismic Toss, dealing damage equal to its level!";
    }
}
