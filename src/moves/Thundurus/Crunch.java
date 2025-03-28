package moves.Thundurus;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
//https://pokemondb.net/move/crunch
public class Crunch extends PhysicalMove {
    public Crunch (){
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        // First, apply the damage to the opponent
        super.applyOppDamage(def, damage);

        // Then, check for the chance to lower Defense
        if (Math.random() <= 0.2) { // 20% chance
            def.setMod(Stat.DEFENSE, -1); // Lowers Defense by 1 stage
        }
    }

    @Override
    protected String describe() {
        return "uses Crunch, biting with a chance to lower Defense!";
    }
}
