package moves.Thundurus;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
//https://pokemondb.net/move/sludge-wave
public class SludgeWave extends SpecialMove {
    public SludgeWave(){
        super(Type.POISON,95,100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        // Calculate damage using the superclass method
        super.applyOppDamage(def, damage);

        // Sludge Wave has a 10% chance to poison the target
        if (Math.random() <= 0.1) {
            Effect.poison(def);
        }
    }

    @Override
    protected String describe() {
        return "uses Sludge Wave and might poison the target";
    }

}
